package hv;

import com.airbnb.deeplinkdispatch.MetadataMasks;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public final class h extends kv.b implements lv.j, lv.l, Comparable, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final h f18728e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f18729f;

    /* renamed from: g, reason: collision with root package name */
    public static final h[] f18730g = new h[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a, reason: collision with root package name */
    public final byte f18731a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f18732b;

    /* renamed from: c, reason: collision with root package name */
    public final byte f18733c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18734d;

    static {
        int i10 = 0;
        while (true) {
            h[] hVarArr = f18730g;
            if (i10 < hVarArr.length) {
                hVarArr[i10] = new h(i10, 0, 0, 0);
                i10++;
            } else {
                f18728e = hVarArr[0];
                f18729f = new h(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public h(int i10, int i11, int i12, int i13) {
        this.f18731a = (byte) i10;
        this.f18732b = (byte) i11;
        this.f18733c = (byte) i12;
        this.f18734d = i13;
    }

    public static h m(int i10, int i11, int i12, int i13) {
        if ((i11 | i12 | i13) == 0) {
            return f18730g[i10];
        }
        return new h(i10, i11, i12, i13);
    }

    public static h n(lv.k kVar) {
        h hVar = (h) kVar.b(lv.n.f25452g);
        if (hVar != null) {
            return hVar;
        }
        throw new RuntimeException("Unable to obtain LocalTime from TemporalAccessor: " + kVar + ", type " + kVar.getClass().getName());
    }

    public static h p(long j10) {
        lv.a.NANO_OF_DAY.h(j10);
        int i10 = (int) (j10 / 3600000000000L);
        long j11 = j10 - (i10 * 3600000000000L);
        int i11 = (int) (j11 / 60000000000L);
        long j12 = j11 - (i11 * 60000000000L);
        int i12 = (int) (j12 / 1000000000);
        return m(i10, i11, i12, (int) (j12 - (i12 * 1000000000)));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static h v(DataInput dataInput) {
        int i10;
        int i11;
        int readByte = dataInput.readByte();
        int i12 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i10 = 0;
            i11 = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                int i13 = ~readByte2;
                i11 = 0;
                i12 = i13;
                i10 = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i10 = ~readByte3;
                } else {
                    i12 = dataInput.readInt();
                    i10 = readByte3;
                }
                i11 = i12;
                i12 = readByte2;
            }
        }
        lv.a.HOUR_OF_DAY.h(readByte);
        lv.a.MINUTE_OF_HOUR.h(i12);
        lv.a.SECOND_OF_MINUTE.h(i10);
        lv.a.NANO_OF_SECOND.h(i11);
        return m(readByte, i12, i10, i11);
    }

    private Object writeReplace() {
        return new n((byte) 5, this);
    }

    public final h A(int i10) {
        if (this.f18734d == i10) {
            return this;
        }
        lv.a.NANO_OF_SECOND.h(i10);
        return m(this.f18731a, this.f18732b, this.f18733c, i10);
    }

    public final void B(DataOutput dataOutput) {
        byte b10 = this.f18733c;
        byte b11 = this.f18731a;
        byte b12 = this.f18732b;
        int i10 = this.f18734d;
        if (i10 == 0) {
            if (b10 == 0) {
                if (b12 == 0) {
                    dataOutput.writeByte(~b11);
                    return;
                } else {
                    dataOutput.writeByte(b11);
                    dataOutput.writeByte(~b12);
                    return;
                }
            }
            dataOutput.writeByte(b11);
            dataOutput.writeByte(b12);
            dataOutput.writeByte(~b10);
            return;
        }
        dataOutput.writeByte(b11);
        dataOutput.writeByte(b12);
        dataOutput.writeByte(b10);
        dataOutput.writeInt(i10);
    }

    @Override // lv.j
    public final lv.j a(long j10, lv.b bVar) {
        if (j10 == Long.MIN_VALUE) {
            return c(Long.MAX_VALUE, bVar).c(1L, bVar);
        }
        return c(-j10, bVar);
    }

    @Override // kv.b, lv.k
    public final Object b(lv.o oVar) {
        if (oVar == lv.n.f25448c) {
            return lv.b.NANOS;
        }
        if (oVar == lv.n.f25452g) {
            return this;
        }
        if (oVar != lv.n.f25447b && oVar != lv.n.f25446a && oVar != lv.n.f25449d && oVar != lv.n.f25450e && oVar != lv.n.f25451f) {
            return oVar.h(this);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lv.j
    public final lv.j e(f fVar) {
        if (fVar instanceof h) {
            return (h) fVar;
        }
        return (h) fVar.h(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f18731a == hVar.f18731a && this.f18732b == hVar.f18732b && this.f18733c == hVar.f18733c && this.f18734d == hVar.f18734d) {
            return true;
        }
        return false;
    }

    @Override // lv.k
    public final long f(lv.m mVar) {
        if (mVar instanceof lv.a) {
            if (mVar == lv.a.NANO_OF_DAY) {
                return w();
            }
            if (mVar == lv.a.MICRO_OF_DAY) {
                return w() / 1000;
            }
            return o(mVar);
        }
        return mVar.e(this);
    }

    @Override // lv.j
    public final long g(lv.j jVar, lv.p pVar) {
        h n10 = n(jVar);
        if (pVar instanceof lv.b) {
            long w10 = n10.w() - w();
            switch ((lv.b) pVar) {
                case NANOS:
                    return w10;
                case MICROS:
                    return w10 / 1000;
                case MILLIS:
                    return w10 / 1000000;
                case SECONDS:
                    return w10 / 1000000000;
                case MINUTES:
                    return w10 / 60000000000L;
                case HOURS:
                    return w10 / 3600000000000L;
                case HALF_DAYS:
                    return w10 / 43200000000000L;
                default:
                    throw new RuntimeException("Unsupported unit: " + pVar);
            }
        }
        return pVar.b(this, n10);
    }

    @Override // lv.l
    public final lv.j h(lv.j jVar) {
        return jVar.d(w(), lv.a.NANO_OF_DAY);
    }

    public final int hashCode() {
        long w10 = w();
        return (int) (w10 ^ (w10 >>> 32));
    }

    @Override // lv.k
    public final boolean i(lv.m mVar) {
        if (mVar instanceof lv.a) {
            return mVar.f();
        }
        if (mVar != null && mVar.c(this)) {
            return true;
        }
        return false;
    }

    @Override // kv.b, lv.k
    public final lv.q j(lv.m mVar) {
        return super.j(mVar);
    }

    @Override // kv.b, lv.k
    public final int k(lv.m mVar) {
        if (mVar instanceof lv.a) {
            return o(mVar);
        }
        return super.k(mVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final int compareTo(h hVar) {
        int i10;
        int i11;
        int i12;
        byte b10 = hVar.f18731a;
        int i13 = 0;
        byte b11 = this.f18731a;
        if (b11 < b10) {
            i10 = -1;
        } else if (b11 > b10) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            byte b12 = this.f18732b;
            byte b13 = hVar.f18732b;
            if (b12 < b13) {
                i11 = -1;
            } else if (b12 > b13) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (i11 == 0) {
                byte b14 = this.f18733c;
                byte b15 = hVar.f18733c;
                if (b14 < b15) {
                    i12 = -1;
                } else if (b14 > b15) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                if (i12 == 0) {
                    int i14 = this.f18734d;
                    int i15 = hVar.f18734d;
                    if (i14 < i15) {
                        i13 = -1;
                    } else if (i14 > i15) {
                        i13 = 1;
                    }
                    return i13;
                }
                return i12;
            }
            return i11;
        }
        return i10;
    }

    public final int o(lv.m mVar) {
        int ordinal = ((lv.a) mVar).ordinal();
        byte b10 = this.f18732b;
        int i10 = this.f18734d;
        byte b11 = this.f18731a;
        switch (ordinal) {
            case 0:
                return i10;
            case 1:
                throw new RuntimeException(da.e.n("Field too large for an int: ", mVar));
            case 2:
                return i10 / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
            case 3:
                throw new RuntimeException(da.e.n("Field too large for an int: ", mVar));
            case 4:
                return i10 / 1000000;
            case 5:
                return (int) (w() / 1000000);
            case 6:
                return this.f18733c;
            case 7:
                return x();
            case 8:
                return b10;
            case 9:
                return (b11 * 60) + b10;
            case 10:
                return b11 % 12;
            case 11:
                int i11 = b11 % 12;
                if (i11 % 12 == 0) {
                    return 12;
                }
                return i11;
            case 12:
                return b11;
            case 13:
                if (b11 == 0) {
                    return 24;
                }
                return b11;
            case 14:
                return b11 / 12;
            default:
                throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
        }
    }

    @Override // lv.j
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final h c(long j10, lv.p pVar) {
        if (pVar instanceof lv.b) {
            switch ((lv.b) pVar) {
                case NANOS:
                    return t(j10);
                case MICROS:
                    return t((j10 % 86400000000L) * 1000);
                case MILLIS:
                    return t((j10 % 86400000) * 1000000);
                case SECONDS:
                    return u(j10);
                case MINUTES:
                    return s(j10);
                case HOURS:
                    return r(j10);
                case HALF_DAYS:
                    return r((j10 % 2) * 12);
                default:
                    throw new RuntimeException("Unsupported unit: " + pVar);
            }
        }
        return (h) pVar.c(this, j10);
    }

    public final h r(long j10) {
        if (j10 == 0) {
            return this;
        }
        return m(((((int) (j10 % 24)) + this.f18731a) + 24) % 24, this.f18732b, this.f18733c, this.f18734d);
    }

    public final h s(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.f18731a * 60) + this.f18732b;
        int i11 = ((((int) (j10 % 1440)) + i10) + 1440) % 1440;
        if (i10 == i11) {
            return this;
        }
        return m(i11 / 60, i11 % 60, this.f18733c, this.f18734d);
    }

    public final h t(long j10) {
        if (j10 == 0) {
            return this;
        }
        long w10 = w();
        long j11 = (((j10 % 86400000000000L) + w10) + 86400000000000L) % 86400000000000L;
        if (w10 == j11) {
            return this;
        }
        return m((int) (j11 / 3600000000000L), (int) ((j11 / 60000000000L) % 60), (int) ((j11 / 1000000000) % 60), (int) (j11 % 1000000000));
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f18731a;
        if (b10 < 10) {
            str = "0";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb2.append(str);
        sb2.append((int) b10);
        String str3 = ":";
        byte b11 = this.f18732b;
        if (b11 >= 10) {
            str2 = ":";
        } else {
            str2 = ":0";
        }
        sb2.append(str2);
        sb2.append((int) b11);
        byte b12 = this.f18733c;
        int i10 = this.f18734d;
        if (b12 > 0 || i10 > 0) {
            if (b12 < 10) {
                str3 = ":0";
            }
            sb2.append(str3);
            sb2.append((int) b12);
            if (i10 > 0) {
                sb2.append('.');
                if (i10 % 1000000 == 0) {
                    sb2.append(Integer.toString((i10 / 1000000) + CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT).substring(1));
                } else if (i10 % CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT == 0) {
                    sb2.append(Integer.toString((i10 / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i10 + Http2Connection.DEGRADED_PONG_TIMEOUT_NS).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    public final h u(long j10) {
        if (j10 == 0) {
            return this;
        }
        int i10 = (this.f18732b * 60) + (this.f18731a * MetadataMasks.ComponentParamMask) + this.f18733c;
        int i11 = ((((int) (j10 % 86400)) + i10) + 86400) % 86400;
        if (i10 == i11) {
            return this;
        }
        return m(i11 / 3600, (i11 / 60) % 60, i11 % 60, this.f18734d);
    }

    public final long w() {
        return (this.f18733c * 1000000000) + (this.f18732b * 60000000000L) + (this.f18731a * 3600000000000L) + this.f18734d;
    }

    public final int x() {
        return (this.f18732b * 60) + (this.f18731a * MetadataMasks.ComponentParamMask) + this.f18733c;
    }

    @Override // lv.j
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final h d(long j10, lv.m mVar) {
        if (mVar instanceof lv.a) {
            lv.a aVar = (lv.a) mVar;
            aVar.h(j10);
            int ordinal = aVar.ordinal();
            byte b10 = this.f18733c;
            int i10 = this.f18734d;
            byte b11 = this.f18732b;
            byte b12 = this.f18731a;
            switch (ordinal) {
                case 0:
                    return A((int) j10);
                case 1:
                    return p(j10);
                case 2:
                    return A(((int) j10) * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
                case 3:
                    return p(j10 * 1000);
                case 4:
                    return A(((int) j10) * 1000000);
                case 5:
                    return p(j10 * 1000000);
                case 6:
                    int i11 = (int) j10;
                    if (b10 == i11) {
                        return this;
                    }
                    lv.a.SECOND_OF_MINUTE.h(i11);
                    return m(b12, b11, i11, i10);
                case 7:
                    return u(j10 - x());
                case 8:
                    int i12 = (int) j10;
                    if (b11 == i12) {
                        return this;
                    }
                    lv.a.MINUTE_OF_HOUR.h(i12);
                    return m(b12, i12, b10, i10);
                case 9:
                    return s(j10 - ((b12 * 60) + b11));
                case 10:
                    return r(j10 - (b12 % 12));
                case 11:
                    if (j10 == 12) {
                        j10 = 0;
                    }
                    return r(j10 - (b12 % 12));
                case 12:
                    return z((int) j10);
                case 13:
                    if (j10 == 24) {
                        j10 = 0;
                    }
                    return z((int) j10);
                case 14:
                    return r((j10 - (b12 / 12)) * 12);
                default:
                    throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
            }
        }
        return (h) mVar.g(this, j10);
    }

    public final h z(int i10) {
        if (this.f18731a == i10) {
            return this;
        }
        lv.a.HOUR_OF_DAY.h(i10);
        return m(i10, this.f18732b, this.f18733c, this.f18734d);
    }
}
