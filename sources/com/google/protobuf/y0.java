package com.google.protobuf;

/* loaded from: classes2.dex */
public final class y0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f11999a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12000b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f12001c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12002d;

    public y0(t tVar, String str, Object[] objArr) {
        this.f11999a = tVar;
        this.f12000b = str;
        this.f12001c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f12002d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                i10 |= (charAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            } else {
                this.f12002d = i10 | (charAt2 << i12);
                return;
            }
        }
    }

    public final b a() {
        return this.f11999a;
    }

    public final Object[] b() {
        return this.f12001c;
    }

    public final String c() {
        return this.f12000b;
    }

    public final int d() {
        return (this.f12002d & 1) == 1 ? 1 : 2;
    }
}
