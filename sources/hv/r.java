package hv;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class r extends q implements lv.k, lv.l, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f18759d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f18760e = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: f, reason: collision with root package name */
    public static final r f18761f = u(0);

    /* renamed from: g, reason: collision with root package name */
    public static final r f18762g = u(-64800);

    /* renamed from: h, reason: collision with root package name */
    public static final r f18763h = u(64800);
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: b, reason: collision with root package name */
    public final int f18764b;

    /* renamed from: c, reason: collision with root package name */
    public final transient String f18765c;

    public r(int i10) {
        String str;
        String str2;
        String str3;
        String sb2;
        this.f18764b = i10;
        if (i10 == 0) {
            sb2 = "Z";
        } else {
            int abs = Math.abs(i10);
            StringBuilder sb3 = new StringBuilder();
            int i11 = abs / 3600;
            int i12 = (abs / 60) % 60;
            if (i10 < 0) {
                str = "-";
            } else {
                str = "+";
            }
            sb3.append(str);
            if (i11 < 10) {
                str2 = "0";
            } else {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            sb3.append(str2);
            sb3.append(i11);
            if (i12 >= 10) {
                str3 = ":";
            } else {
                str3 = ":0";
            }
            sb3.append(str3);
            sb3.append(i12);
            int i13 = abs % 60;
            if (i13 != 0) {
                sb3.append(i13 < 10 ? ":0" : ":");
                sb3.append(i13);
            }
            sb2 = sb3.toString();
        }
        this.f18765c = sb2;
    }

    public static r r(lv.k kVar) {
        r rVar = (r) kVar.b(lv.n.f25450e);
        if (rVar != null) {
            return rVar;
        }
        throw new RuntimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + kVar + ", type " + kVar.getClass().getName());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static hv.r s(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            el.l.D0(r7, r0)
            java.util.concurrent.ConcurrentHashMap r0 = hv.r.f18760e
            java.lang.Object r0 = r0.get(r7)
            hv.r r0 = (hv.r) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L5a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = v(r7, r2, r3)
            int r1 = v(r7, r6, r2)
            int r2 = v(r7, r5, r2)
            goto L85
        L37:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = v(r7, r2, r3)
            int r1 = v(r7, r1, r3)
            int r2 = v(r7, r4, r3)
            goto L85
        L50:
            int r0 = v(r7, r2, r3)
            int r1 = v(r7, r6, r2)
        L58:
            r2 = r3
            goto L85
        L5a:
            int r0 = v(r7, r2, r3)
            int r1 = v(r7, r1, r3)
            goto L58
        L63:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L7f:
            int r0 = v(r7, r2, r3)
            r1 = r3
            r2 = r1
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            hv.r r7 = t(r7, r0, r1)
            return r7
        La8:
            hv.r r7 = t(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hv.r.s(java.lang.String):hv.r");
    }

    public static r t(int i10, int i11, int i12) {
        if (i10 >= -18 && i10 <= 18) {
            if (i10 > 0) {
                if (i11 < 0 || i12 < 0) {
                    throw new RuntimeException("Zone offset minutes and seconds must be positive because hours is positive");
                }
            } else if (i10 < 0) {
                if (i11 > 0 || i12 > 0) {
                    throw new RuntimeException("Zone offset minutes and seconds must be negative because hours is negative");
                }
            } else if ((i11 > 0 && i12 < 0) || (i11 < 0 && i12 > 0)) {
                throw new RuntimeException("Zone offset minutes and seconds must have the same sign");
            }
            if (Math.abs(i11) <= 59) {
                if (Math.abs(i12) <= 59) {
                    if (Math.abs(i10) == 18 && (Math.abs(i11) > 0 || Math.abs(i12) > 0)) {
                        throw new RuntimeException("Zone offset not in valid range: -18:00 to +18:00");
                    }
                    return u((i11 * 60) + (i10 * 3600) + i12);
                }
                throw new RuntimeException("Zone offset seconds not in valid range: abs(value) " + Math.abs(i12) + " is not in the range 0 to 59");
            }
            throw new RuntimeException("Zone offset minutes not in valid range: abs(value) " + Math.abs(i11) + " is not in the range 0 to 59");
        }
        throw new RuntimeException(jr.h.o("Zone offset hours not in valid range: value ", i10, " is not in the range -18 to 18"));
    }

    public static r u(int i10) {
        if (Math.abs(i10) <= 64800) {
            if (i10 % 900 == 0) {
                Integer valueOf = Integer.valueOf(i10);
                ConcurrentHashMap concurrentHashMap = f18759d;
                r rVar = (r) concurrentHashMap.get(valueOf);
                if (rVar == null) {
                    concurrentHashMap.putIfAbsent(valueOf, new r(i10));
                    r rVar2 = (r) concurrentHashMap.get(valueOf);
                    f18760e.putIfAbsent(rVar2.f18765c, rVar2);
                    return rVar2;
                }
                return rVar;
            }
            return new r(i10);
        }
        throw new RuntimeException("Zone offset not in valid range: -18:00 to +18:00");
    }

    public static int v(CharSequence charSequence, int i10, boolean z10) {
        if (z10 && charSequence.charAt(i10 - 1) != ':') {
            throw new RuntimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char charAt = charSequence.charAt(i10);
        char charAt2 = charSequence.charAt(i10 + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new RuntimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    public static r w(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        if (readByte == Byte.MAX_VALUE) {
            return u(dataInput.readInt());
        }
        return u(readByte * 900);
    }

    private Object writeReplace() {
        return new n((byte) 8, this);
    }

    @Override // lv.k
    public final Object b(lv.o oVar) {
        if (oVar != lv.n.f25450e && oVar != lv.n.f25449d) {
            if (oVar != lv.n.f25451f && oVar != lv.n.f25452g && oVar != lv.n.f25448c && oVar != lv.n.f25447b && oVar != lv.n.f25446a) {
                return oVar.h(this);
            }
            return null;
        }
        return this;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((r) obj).f18764b - this.f18764b;
    }

    @Override // hv.q
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        if (this.f18764b == ((r) obj).f18764b) {
            return true;
        }
        return false;
    }

    @Override // lv.k
    public final long f(lv.m mVar) {
        if (mVar == lv.a.OFFSET_SECONDS) {
            return this.f18764b;
        }
        if (!(mVar instanceof lv.a)) {
            return mVar.e(this);
        }
        throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
    }

    @Override // lv.l
    public final lv.j h(lv.j jVar) {
        return jVar.d(this.f18764b, lv.a.OFFSET_SECONDS);
    }

    @Override // hv.q
    public final int hashCode() {
        return this.f18764b;
    }

    @Override // lv.k
    public final boolean i(lv.m mVar) {
        if (mVar instanceof lv.a) {
            if (mVar != lv.a.OFFSET_SECONDS) {
                return false;
            }
            return true;
        }
        if (mVar == null || !mVar.c(this)) {
            return false;
        }
        return true;
    }

    @Override // lv.k
    public final lv.q j(lv.m mVar) {
        if (mVar == lv.a.OFFSET_SECONDS) {
            return mVar.d();
        }
        if (!(mVar instanceof lv.a)) {
            return mVar.b(this);
        }
        throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
    }

    @Override // lv.k
    public final int k(lv.m mVar) {
        if (mVar == lv.a.OFFSET_SECONDS) {
            return this.f18764b;
        }
        if (!(mVar instanceof lv.a)) {
            return j(mVar).a(f(mVar), mVar);
        }
        throw new RuntimeException(da.e.n("Unsupported field: ", mVar));
    }

    @Override // hv.q
    public final String m() {
        return this.f18765c;
    }

    @Override // hv.q
    public final mv.h n() {
        return new mv.g(this);
    }

    @Override // hv.q
    public final void q(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        x(dataOutput);
    }

    @Override // hv.q
    public final String toString() {
        return this.f18765c;
    }

    public final void x(DataOutput dataOutput) {
        int i10;
        int i11 = this.f18764b;
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
}
