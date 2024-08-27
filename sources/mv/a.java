package mv;

import hv.r;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: a, reason: collision with root package name */
    public byte f28074a;

    /* renamed from: b, reason: collision with root package name */
    public Object f28075b;

    public a(byte b10, Object obj) {
        this.f28074a = b10;
        this.f28075b = obj;
    }

    public static long a(DataInput dataInput) {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    public static Serializable b(byte b10, DataInput dataInput) {
        if (b10 != 1) {
            if (b10 != 2) {
                if (b10 == 3) {
                    return f.a(dataInput);
                }
                throw new StreamCorruptedException("Unknown serialized type");
            }
            long a10 = a(dataInput);
            r c10 = c(dataInput);
            r c11 = c(dataInput);
            if (!c10.equals(c11)) {
                return new e(a10, c10, c11);
            }
            throw new IllegalArgumentException("Offsets must not be equal");
        }
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            jArr[i10] = a(dataInput);
        }
        int i11 = readInt + 1;
        r[] rVarArr = new r[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            rVarArr[i12] = c(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = new long[readInt2];
        for (int i13 = 0; i13 < readInt2; i13++) {
            jArr2[i13] = a(dataInput);
        }
        int i14 = readInt2 + 1;
        r[] rVarArr2 = new r[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            rVarArr2[i15] = c(dataInput);
        }
        int readByte = dataInput.readByte();
        f[] fVarArr = new f[readByte];
        for (int i16 = 0; i16 < readByte; i16++) {
            fVarArr[i16] = f.a(dataInput);
        }
        return new b(jArr, rVarArr, jArr2, rVarArr2, fVarArr);
    }

    public static r c(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        if (readByte == Byte.MAX_VALUE) {
            return r.u(dataInput.readInt());
        }
        return r.u(readByte * 900);
    }

    public static void d(long j10, DataOutput dataOutput) {
        if (j10 >= -4575744000L && j10 < 10413792000L && j10 % 900 == 0) {
            int i10 = (int) ((j10 + 4575744000L) / 900);
            dataOutput.writeByte((i10 >>> 16) & 255);
            dataOutput.writeByte((i10 >>> 8) & 255);
            dataOutput.writeByte(i10 & 255);
            return;
        }
        dataOutput.writeByte(255);
        dataOutput.writeLong(j10);
    }

    public static void e(r rVar, DataOutput dataOutput) {
        int i10;
        int i11 = rVar.f18764b;
        if (i11 % 900 == 0) {
            i10 = i11 / 900;
        } else {
            i10 = 127;
        }
        dataOutput.writeByte(i10);
        if (i10 == 127) {
            dataOutput.writeInt(i11);
        }
    }

    private Object readResolve() {
        return this.f28075b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f28074a = readByte;
        this.f28075b = b(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b10 = this.f28074a;
        Object obj = this.f28075b;
        objectOutput.writeByte(b10);
        if (b10 != 1) {
            if (b10 != 2) {
                if (b10 == 3) {
                    ((f) obj).b(objectOutput);
                    return;
                }
                throw new InvalidClassException("Unknown serialized type");
            }
            e eVar = (e) obj;
            hv.g gVar = eVar.f28091a;
            r rVar = eVar.f28092b;
            d(gVar.l(rVar), objectOutput);
            e(rVar, objectOutput);
            e(eVar.f28093c, objectOutput);
            return;
        }
        b bVar = (b) obj;
        long[] jArr = bVar.f28076a;
        objectOutput.writeInt(jArr.length);
        for (long j10 : jArr) {
            d(j10, objectOutput);
        }
        for (r rVar2 : bVar.f28077b) {
            e(rVar2, objectOutput);
        }
        long[] jArr2 = bVar.f28078c;
        objectOutput.writeInt(jArr2.length);
        for (long j11 : jArr2) {
            d(j11, objectOutput);
        }
        for (r rVar3 : bVar.f28080e) {
            e(rVar3, objectOutput);
        }
        f[] fVarArr = bVar.f28081f;
        objectOutput.writeByte(fVarArr.length);
        for (f fVar : fVarArr) {
            fVar.b(objectOutput);
        }
    }
}
