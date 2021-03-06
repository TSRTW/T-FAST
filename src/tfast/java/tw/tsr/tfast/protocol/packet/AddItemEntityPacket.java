/*
 * GNU LESSER GENERAL PUBLIC LICENSE
 *                       Version 3, 29 June 2007
 *
 * Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/>
 * Everyone is permitted to copy and distribute verbatim copies
 * of this license document, but changing it is not allowed.
 *
 * You can view LICENCE file for details. 
 *
 * 
 */
package tw.tsr.tfast.protocol.packet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import tw.tsr.inventory.PEInventorySlot;
import tw.tsr.tfast.protocol.inf.mcpe.NetworkChannel;
import tw.tsr.tfast.utilities.io.PEBinaryWriter;

public class AddItemEntityPacket extends PEPacket {

    public long eid;
    public long rtid;
    public PEInventorySlot item;
    public float x;
    public float y;
    public float z;
    public float speedX;
    public float speedY;
    public float speedZ;

    @Override
    public int pid() {
        return PEPacketIDs.ADD_ITEM_ENTITY_PACKET;
    }

    @Override
    public void encode() {
        try {
            setChannel(NetworkChannel.CHANNEL_ENTITY_SPAWNING);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            PEBinaryWriter writer = new PEBinaryWriter(bos);
            writer.writeByte((byte) (this.pid() & 0xFF));
            writer.writeLong(eid);
            writer.writeLong(rtid);
            PEInventorySlot.writeSlot(writer, item);
            writer.writeVector3f(x, y, z);
            writer.writeVector3f(speedX, speedY, speedZ);
            this.setData(bos.toByteArray());
        } catch (IOException e) {
        }
    }

    @Override
    public void decode() {
    }

}
