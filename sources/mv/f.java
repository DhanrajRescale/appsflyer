package mv;

import com.airbnb.deeplinkdispatch.MetadataMasks;
import el.l;
import hv.r;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import w.k;

/* loaded from: classes2.dex */
public final class f implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a, reason: collision with root package name */
    public final hv.i f28094a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f28095b;

    /* renamed from: c, reason: collision with root package name */
    public final hv.c f28096c;

    /* renamed from: d, reason: collision with root package name */
    public final hv.h f28097d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28098e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28099f;

    /* renamed from: g, reason: collision with root package name */
    public final r f28100g;

    /* renamed from: h, reason: collision with root package name */
    public final r f28101h;

    /* renamed from: i, reason: collision with root package name */
    public final r f28102i;

    public f(hv.i iVar, int i10, hv.c cVar, hv.h hVar, int i11, int i12, r rVar, r rVar2, r rVar3) {
        this.f28094a = iVar;
        this.f28095b = (byte) i10;
        this.f28096c = cVar;
        this.f28097d = hVar;
        this.f28098e = i11;
        this.f28099f = i12;
        this.f28100g = rVar;
        this.f28101h = rVar2;
        this.f28102i = rVar3;
    }

    public static f a(DataInput dataInput) {
        hv.c m10;
        int i10;
        int i11;
        int i12;
        r u10;
        int i13;
        int readInt = dataInput.readInt();
        hv.i p10 = hv.i.p(readInt >>> 28);
        int i14 = ((264241152 & readInt) >>> 22) - 32;
        int i15 = (3670016 & readInt) >>> 19;
        if (i15 == 0) {
            m10 = null;
        } else {
            m10 = hv.c.m(i15);
        }
        hv.c cVar = m10;
        int i16 = (507904 & readInt) >>> 14;
        int i17 = k.g(3)[(readInt & 12288) >>> 12];
        int i18 = (readInt & 4080) >>> 4;
        int i19 = (readInt & 12) >>> 2;
        int i20 = readInt & 3;
        if (i16 == 31) {
            i10 = dataInput.readInt();
        } else {
            i10 = i16 * 3600;
        }
        if (i18 == 255) {
            i11 = dataInput.readInt();
        } else {
            i11 = (i18 - 128) * 900;
        }
        r u11 = r.u(i11);
        int i21 = u11.f18764b;
        if (i19 == 3) {
            i12 = dataInput.readInt();
        } else {
            i12 = (i19 * 1800) + i21;
        }
        r u12 = r.u(i12);
        if (i20 == 3) {
            u10 = r.u(dataInput.readInt());
        } else {
            u10 = r.u((i20 * 1800) + i21);
        }
        if (i14 >= -28 && i14 <= 31 && i14 != 0) {
            long X = l.X(i10, 86400);
            hv.h hVar = hv.h.f18728e;
            lv.a.SECOND_OF_DAY.h(X);
            int i22 = (int) (X / 3600);
            long j10 = X - (i22 * 3600);
            hv.h m11 = hv.h.m(i22, (int) (j10 / 60), (int) (j10 - (r9 * 60)), 0);
            if (i10 >= 0) {
                i13 = i10 / 86400;
            } else {
                i13 = ((i10 + 1) / 86400) - 1;
            }
            return new f(p10, i14, cVar, m11, i13, i17, u11, u12, u10);
        }
        throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        byte b10;
        int i10;
        int i11;
        int i12;
        int l10;
        hv.h hVar = this.f28097d;
        int x10 = (this.f28098e * 86400) + hVar.x();
        int i13 = this.f28100g.f18764b;
        r rVar = this.f28101h;
        int i14 = rVar.f18764b - i13;
        r rVar2 = this.f28102i;
        int i15 = rVar2.f18764b - i13;
        if (x10 % 3600 == 0 && x10 <= 86400) {
            if (x10 == 86400) {
                b10 = 24;
            } else {
                b10 = hVar.f18731a;
            }
        } else {
            b10 = 31;
        }
        if (i13 % 900 == 0) {
            i10 = (i13 / 900) + 128;
        } else {
            i10 = 255;
        }
        if (i14 != 0 && i14 != 1800 && i14 != 3600) {
            i11 = 3;
        } else {
            i11 = i14 / 1800;
        }
        if (i15 != 0 && i15 != 1800 && i15 != 3600) {
            i12 = 3;
        } else {
            i12 = i15 / 1800;
        }
        hv.c cVar = this.f28096c;
        if (cVar == null) {
            l10 = 0;
        } else {
            l10 = cVar.l();
        }
        dataOutput.writeInt((this.f28094a.m() << 28) + ((this.f28095b + MetadataMasks.ConfigurablePathSegmentMask) << 22) + (l10 << 19) + (b10 << 14) + (k.e(this.f28099f) << 12) + (i10 << 4) + (i11 << 2) + i12);
        if (b10 == 31) {
            dataOutput.writeInt(x10);
        }
        if (i10 == 255) {
            dataOutput.writeInt(i13);
        }
        if (i11 == 3) {
            dataOutput.writeInt(rVar.f18764b);
        }
        if (i12 == 3) {
            dataOutput.writeInt(rVar2.f18764b);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f28094a == fVar.f28094a && this.f28095b == fVar.f28095b && this.f28096c == fVar.f28096c && this.f28099f == fVar.f28099f && this.f28098e == fVar.f28098e && this.f28097d.equals(fVar.f28097d) && this.f28100g.equals(fVar.f28100g) && this.f28101h.equals(fVar.f28101h) && this.f28102i.equals(fVar.f28102i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int ordinal;
        int x10 = ((this.f28097d.x() + this.f28098e) << 15) + (this.f28094a.ordinal() << 11) + ((this.f28095b + MetadataMasks.ConfigurablePathSegmentMask) << 5);
        hv.c cVar = this.f28096c;
        if (cVar == null) {
            ordinal = 7;
        } else {
            ordinal = cVar.ordinal();
        }
        return ((this.f28100g.f18764b ^ (k.e(this.f28099f) + (x10 + (ordinal << 2)))) ^ this.f28101h.f18764b) ^ this.f28102i.f18764b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        r rVar = this.f28101h;
        rVar.getClass();
        r rVar2 = this.f28102i;
        if (rVar2.f18764b - rVar.f18764b > 0) {
            str = "Gap ";
        } else {
            str = "Overlap ";
        }
        sb2.append(str);
        sb2.append(rVar);
        sb2.append(" to ");
        sb2.append(rVar2);
        sb2.append(", ");
        hv.i iVar = this.f28094a;
        byte b10 = this.f28095b;
        hv.c cVar = this.f28096c;
        if (cVar != null) {
            if (b10 == -1) {
                sb2.append(cVar.name());
                sb2.append(" on or before last day of ");
                sb2.append(iVar.name());
            } else if (b10 < 0) {
                sb2.append(cVar.name());
                sb2.append(" on or before last day minus ");
                sb2.append((-b10) - 1);
                sb2.append(" of ");
                sb2.append(iVar.name());
            } else {
                sb2.append(cVar.name());
                sb2.append(" on or after ");
                sb2.append(iVar.name());
                sb2.append(' ');
                sb2.append((int) b10);
            }
        } else {
            sb2.append(iVar.name());
            sb2.append(' ');
            sb2.append((int) b10);
        }
        sb2.append(" at ");
        hv.h hVar = this.f28097d;
        int i10 = this.f28098e;
        if (i10 == 0) {
            sb2.append(hVar);
        } else {
            long x10 = (i10 * 1440) + (hVar.x() / 60);
            long W = l.W(x10, 60L);
            if (W < 10) {
                sb2.append(0);
            }
            sb2.append(W);
            sb2.append(':');
            long Y = l.Y(60, x10);
            if (Y < 10) {
                sb2.append(0);
            }
            sb2.append(Y);
        }
        sb2.append(" ");
        sb2.append(jr.h.D(this.f28099f));
        sb2.append(", standard offset ");
        sb2.append(this.f28100g);
        sb2.append(']');
        return sb2.toString();
    }
}
