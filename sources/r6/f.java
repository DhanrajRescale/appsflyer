package r6;

import e5.p;
import java.io.EOFException;
import z5.q;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final g f33368a = new g();

    /* renamed from: b, reason: collision with root package name */
    public final p f33369b = new p(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f33370c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f33371d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33372e;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        this.f33371d = 0;
        do {
            int i13 = this.f33371d;
            int i14 = i10 + i13;
            g gVar = this.f33368a;
            if (i14 >= gVar.f33375c) {
                break;
            }
            int[] iArr = gVar.f33378f;
            this.f33371d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final boolean b(q qVar) {
        int i10;
        boolean z10 = this.f33372e;
        p pVar = this.f33369b;
        if (z10) {
            this.f33372e = false;
            pVar.C(0);
        }
        while (true) {
            boolean z11 = true;
            if (this.f33372e) {
                return true;
            }
            int i11 = this.f33370c;
            g gVar = this.f33368a;
            if (i11 < 0) {
                if (!gVar.b(qVar, -1L) || !gVar.a(qVar, true)) {
                    break;
                }
                int i12 = gVar.f33376d;
                if ((gVar.f33373a & 1) == 1 && pVar.f15038c == 0) {
                    i12 += a(0);
                    i10 = this.f33371d;
                } else {
                    i10 = 0;
                }
                try {
                    qVar.j(i12);
                    this.f33370c = i10;
                } catch (EOFException unused) {
                }
            }
            int a10 = a(this.f33370c);
            int i13 = this.f33370c + this.f33371d;
            if (a10 > 0) {
                pVar.b(pVar.f15038c + a10);
                try {
                    qVar.readFully(pVar.f15036a, pVar.f15038c, a10);
                    pVar.E(pVar.f15038c + a10);
                    if (gVar.f33378f[i13 - 1] == 255) {
                        z11 = false;
                    }
                    this.f33372e = z11;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i13 == gVar.f33375c) {
                i13 = -1;
            }
            this.f33370c = i13;
        }
        return false;
    }
}
