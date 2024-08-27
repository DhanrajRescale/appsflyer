package p2;

import d2.w0;
import d2.y0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public c0 f30578a;

    /* renamed from: b, reason: collision with root package name */
    public k f30579b;

    public final c0 a(List list) {
        i iVar;
        Exception e10;
        long b10;
        j2.f0 f0Var = null;
        try {
            int size = list.size();
            int i10 = 0;
            iVar = null;
            while (i10 < size) {
                try {
                    i iVar2 = (i) list.get(i10);
                    try {
                        iVar2.a(this.f30579b);
                        i10++;
                        iVar = iVar2;
                    } catch (Exception e11) {
                        e10 = e11;
                        iVar = iVar2;
                        StringBuilder sb2 = new StringBuilder();
                        StringBuilder sb3 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb3.append(this.f30579b.f30582a.a());
                        sb3.append(", composition=");
                        sb3.append(this.f30579b.c());
                        sb3.append(", selection=");
                        k kVar = this.f30579b;
                        sb3.append((Object) j2.f0.g(w0.b(kVar.f30583b, kVar.f30584c)));
                        sb3.append("):");
                        sb2.append(sb3.toString());
                        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
                        sb2.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
                        vt.g0.A(list, sb2, new y0(7, iVar, this), 60);
                        String sb4 = sb2.toString();
                        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
                        throw new RuntimeException(sb4, e10);
                    }
                } catch (Exception e12) {
                    e10 = e12;
                }
            }
            k kVar2 = this.f30579b;
            kVar2.getClass();
            j2.e eVar = new j2.e(kVar2.f30582a.toString(), null, 6);
            k kVar3 = this.f30579b;
            long b11 = w0.b(kVar3.f30583b, kVar3.f30584c);
            j2.f0 f0Var2 = new j2.f0(b11);
            if (!j2.f0.f(this.f30578a.f30523b)) {
                f0Var = f0Var2;
            }
            if (f0Var != null) {
                b10 = f0Var.f20712a;
            } else {
                b10 = w0.b(j2.f0.d(b11), j2.f0.e(b11));
            }
            c0 c0Var = new c0(eVar, b10, this.f30579b.c());
            this.f30578a = c0Var;
            return c0Var;
        } catch (Exception e13) {
            iVar = null;
            e10 = e13;
        }
    }

    public final void b(c0 c0Var, i0 i0Var) {
        boolean z10 = true;
        boolean z11 = !Intrinsics.a(c0Var.f30524c, this.f30579b.c());
        j2.e eVar = this.f30578a.f30522a;
        j2.e eVar2 = c0Var.f30522a;
        boolean a10 = Intrinsics.a(eVar, eVar2);
        boolean z12 = false;
        long j10 = c0Var.f30523b;
        if (!a10) {
            this.f30579b = new k(eVar2, j10);
        } else if (!j2.f0.a(this.f30578a.f30523b, j10)) {
            this.f30579b.f(j2.f0.e(j10), j2.f0.d(j10));
            z12 = true;
            z10 = false;
        } else {
            z10 = false;
        }
        j2.f0 f0Var = c0Var.f30524c;
        if (f0Var == null) {
            k kVar = this.f30579b;
            kVar.f30585d = -1;
            kVar.f30586e = -1;
        } else {
            long j11 = f0Var.f20712a;
            if (!j2.f0.b(j11)) {
                this.f30579b.e(j2.f0.e(j11), j2.f0.d(j11));
            }
        }
        if (z10 || (!z12 && z11)) {
            k kVar2 = this.f30579b;
            kVar2.f30585d = -1;
            kVar2.f30586e = -1;
            c0Var = c0.a(c0Var, null, 0L, 3);
        }
        c0 c0Var2 = this.f30578a;
        this.f30578a = c0Var;
        if (i0Var != null) {
            i0Var.a(c0Var2, c0Var);
        }
    }
}
