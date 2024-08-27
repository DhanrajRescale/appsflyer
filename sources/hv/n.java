package hv;

import java.io.DataInput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class n implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a, reason: collision with root package name */
    public byte f18751a;

    /* renamed from: b, reason: collision with root package name */
    public Object f18752b;

    public n() {
    }

    public static Serializable a(DataInput dataInput) {
        return b(dataInput.readByte(), dataInput);
    }

    public static Serializable b(byte b10, DataInput dataInput) {
        s sVar;
        s sVar2;
        if (b10 != 64) {
            switch (b10) {
                case 1:
                    d dVar = d.f18713c;
                    return d.d(dataInput.readLong(), dataInput.readInt());
                case 2:
                    e eVar = e.f18716c;
                    return e.o(dataInput.readLong(), dataInput.readInt());
                case 3:
                    return f.G(dataInput);
                case 4:
                    g gVar = g.f18724c;
                    return g.t(f.G(dataInput), h.v(dataInput));
                case 5:
                    return h.v(dataInput);
                case 6:
                    g gVar2 = g.f18724c;
                    g t10 = g.t(f.G(dataInput), h.v(dataInput));
                    r w10 = r.w(dataInput);
                    q qVar = (q) a(dataInput);
                    el.l.D0(qVar, "zone");
                    if ((qVar instanceof r) && !w10.equals(qVar)) {
                        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
                    }
                    return new t(t10, qVar, w10);
                case 7:
                    Pattern pattern = s.f18766d;
                    String readUTF = dataInput.readUTF();
                    if (!readUTF.equals("Z") && !readUTF.startsWith("+") && !readUTF.startsWith("-")) {
                        if (!readUTF.equals("UTC") && !readUTF.equals("GMT") && !readUTF.equals("UT")) {
                            if (!readUTF.startsWith("UTC+") && !readUTF.startsWith("GMT+") && !readUTF.startsWith("UTC-") && !readUTF.startsWith("GMT-")) {
                                if (!readUTF.startsWith("UT+") && !readUTF.startsWith("UT-")) {
                                    return s.r(readUTF, false);
                                }
                                r s7 = r.s(readUTF.substring(2));
                                if (s7.f18764b == 0) {
                                    sVar2 = new s("UT", new mv.g(s7));
                                } else {
                                    sVar2 = new s("UT" + s7.f18765c, new mv.g(s7));
                                }
                                return sVar2;
                            }
                            r s10 = r.s(readUTF.substring(3));
                            if (s10.f18764b == 0) {
                                sVar = new s(readUTF.substring(0, 3), new mv.g(s10));
                            } else {
                                sVar = new s(readUTF.substring(0, 3) + s10.f18765c, new mv.g(s10));
                            }
                            return sVar;
                        }
                        r rVar = r.f18761f;
                        rVar.getClass();
                        return new s(readUTF, new mv.g(rVar));
                    }
                    throw new RuntimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(readUTF));
                case 8:
                    return r.w(dataInput);
                default:
                    switch (b10) {
                        case 66:
                            int i10 = l.f18744c;
                            return new l(h.v(dataInput), r.w(dataInput));
                        case 67:
                            int i11 = o.f18753b;
                            return o.n(dataInput.readInt());
                        case 68:
                            int i12 = p.f18755c;
                            int readInt = dataInput.readInt();
                            byte readByte = dataInput.readByte();
                            lv.a.YEAR.h(readInt);
                            lv.a.MONTH_OF_YEAR.h(readByte);
                            return new p(readInt, readByte);
                        case 69:
                            int i13 = k.f18741c;
                            g gVar3 = g.f18724c;
                            return new k(g.t(f.G(dataInput), h.v(dataInput)), r.w(dataInput));
                        default:
                            throw new StreamCorruptedException("Unknown serialized type");
                    }
            }
        }
        int i14 = j.f18738c;
        return j.l(dataInput.readByte(), dataInput.readByte());
    }

    private Object readResolve() {
        return this.f18752b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f18751a = readByte;
        this.f18752b = b(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b10 = this.f18751a;
        Object obj = this.f18752b;
        objectOutput.writeByte(b10);
        if (b10 != 64) {
            switch (b10) {
                case 1:
                    d dVar = (d) obj;
                    objectOutput.writeLong(dVar.f18714a);
                    objectOutput.writeInt(dVar.f18715b);
                    return;
                case 2:
                    e eVar = (e) obj;
                    objectOutput.writeLong(eVar.f18717a);
                    objectOutput.writeInt(eVar.f18718b);
                    return;
                case 3:
                    f fVar = (f) obj;
                    objectOutput.writeInt(fVar.f18721a);
                    objectOutput.writeByte(fVar.f18722b);
                    objectOutput.writeByte(fVar.f18723c);
                    return;
                case 4:
                    g gVar = (g) obj;
                    f fVar2 = gVar.f18726a;
                    objectOutput.writeInt(fVar2.f18721a);
                    objectOutput.writeByte(fVar2.f18722b);
                    objectOutput.writeByte(fVar2.f18723c);
                    gVar.f18727b.B(objectOutput);
                    return;
                case 5:
                    ((h) obj).B(objectOutput);
                    return;
                case 6:
                    t tVar = (t) obj;
                    g gVar2 = tVar.f18769a;
                    f fVar3 = gVar2.f18726a;
                    objectOutput.writeInt(fVar3.f18721a);
                    objectOutput.writeByte(fVar3.f18722b);
                    objectOutput.writeByte(fVar3.f18723c);
                    gVar2.f18727b.B(objectOutput);
                    tVar.f18770b.x(objectOutput);
                    tVar.f18771c.q(objectOutput);
                    return;
                case 7:
                    objectOutput.writeUTF(((s) obj).f18767b);
                    return;
                case 8:
                    ((r) obj).x(objectOutput);
                    return;
                default:
                    switch (b10) {
                        case 66:
                            l lVar = (l) obj;
                            lVar.f18745a.B(objectOutput);
                            lVar.f18746b.x(objectOutput);
                            return;
                        case 67:
                            objectOutput.writeInt(((o) obj).f18754a);
                            return;
                        case 68:
                            p pVar = (p) obj;
                            objectOutput.writeInt(pVar.f18756a);
                            objectOutput.writeByte(pVar.f18757b);
                            return;
                        case 69:
                            k kVar = (k) obj;
                            g gVar3 = kVar.f18742a;
                            f fVar4 = gVar3.f18726a;
                            objectOutput.writeInt(fVar4.f18721a);
                            objectOutput.writeByte(fVar4.f18722b);
                            objectOutput.writeByte(fVar4.f18723c);
                            gVar3.f18727b.B(objectOutput);
                            kVar.f18743b.x(objectOutput);
                            return;
                        default:
                            throw new InvalidClassException("Unknown serialized type");
                    }
            }
        }
        j jVar = (j) obj;
        objectOutput.writeByte(jVar.f18739a);
        objectOutput.writeByte(jVar.f18740b);
    }

    public n(byte b10, Object obj) {
        this.f18751a = b10;
        this.f18752b = obj;
    }
}
