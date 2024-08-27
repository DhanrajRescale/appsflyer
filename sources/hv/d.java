package hv;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2Connection;
import org.threeten.bp.DateTimeException;

/* loaded from: classes2.dex */
public final class d implements Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final d f18713c = new d(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a, reason: collision with root package name */
    public final long f18714a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18715b;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    public d(int i10, long j10) {
        this.f18714a = j10;
        this.f18715b = i10;
    }

    public static d a(t tVar, t tVar2) {
        lv.b bVar = lv.b.SECONDS;
        long g10 = tVar.g(tVar2, bVar);
        lv.a aVar = lv.a.NANO_OF_SECOND;
        long j10 = 0;
        if (tVar.i(aVar) && tVar2.i(aVar)) {
            try {
                long f10 = tVar.f(aVar);
                long f11 = tVar2.f(aVar) - f10;
                if (g10 > 0 && f11 < 0) {
                    f11 += 1000000000;
                } else if (g10 < 0 && f11 > 0) {
                    f11 -= 1000000000;
                } else if (g10 == 0 && f11 != 0) {
                    try {
                        g10 = tVar.g(tVar2.d(f10, aVar), bVar);
                    } catch (ArithmeticException | DateTimeException unused) {
                    }
                }
                j10 = f11;
            } catch (ArithmeticException | DateTimeException unused2) {
            }
        }
        return d(g10, j10);
    }

    public static d b(int i10, long j10) {
        if ((i10 | j10) == 0) {
            return f18713c;
        }
        return new d(i10, j10);
    }

    public static d c(long j10) {
        long j11 = j10 / 1000000000;
        int i10 = (int) (j10 % 1000000000);
        if (i10 < 0) {
            i10 += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            j11--;
        }
        return b(i10, j11);
    }

    public static d d(long j10, long j11) {
        return b(el.l.Y(Http2Connection.DEGRADED_PONG_TIMEOUT_NS, j11), el.l.F0(j10, el.l.W(j11, 1000000000L)));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 1, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        int C = el.l.C(this.f18714a, dVar.f18714a);
        if (C == 0) {
            return this.f18715b - dVar.f18715b;
        }
        return C;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f18714a == dVar.f18714a && this.f18715b == dVar.f18715b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f18714a;
        return (this.f18715b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        if (this == f18713c) {
            return "PT0S";
        }
        long j10 = this.f18714a;
        long j11 = j10 / 3600;
        int i10 = (int) ((j10 % 3600) / 60);
        int i11 = (int) (j10 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j11 != 0) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        int i12 = this.f18715b;
        if (i11 == 0 && i12 == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (i11 < 0 && i12 > 0) {
            if (i11 == -1) {
                sb2.append("-0");
            } else {
                sb2.append(i11 + 1);
            }
        } else {
            sb2.append(i11);
        }
        if (i12 > 0) {
            int length = sb2.length();
            if (i11 < 0) {
                sb2.append(2000000000 - i12);
            } else {
                sb2.append(i12 + Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }
}
