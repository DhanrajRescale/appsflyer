package uu;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import tu.w0;
import ut.l;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public c[] f37413a;

    /* renamed from: b, reason: collision with root package name */
    public int f37414b;

    /* renamed from: c, reason: collision with root package name */
    public int f37415c;

    /* renamed from: d, reason: collision with root package name */
    public c0 f37416d;

    public final c g() {
        c cVar;
        c0 c0Var;
        synchronized (this) {
            try {
                c[] cVarArr = this.f37413a;
                if (cVarArr == null) {
                    cVarArr = i();
                    this.f37413a = cVarArr;
                } else if (this.f37414b >= cVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                    this.f37413a = (c[]) copyOf;
                    cVarArr = (c[]) copyOf;
                }
                int i10 = this.f37415c;
                do {
                    cVar = cVarArr[i10];
                    if (cVar == null) {
                        cVar = h();
                        cVarArr[i10] = cVar;
                    }
                    i10++;
                    if (i10 >= cVarArr.length) {
                        i10 = 0;
                    }
                    Intrinsics.d(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!cVar.a(this));
                this.f37415c = i10;
                this.f37414b++;
                c0Var = this.f37416d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c0Var != null) {
            c0Var.y(1);
        }
        return cVar;
    }

    public abstract c h();

    public abstract c[] i();

    public final void j(c cVar) {
        c0 c0Var;
        int i10;
        yt.a[] b10;
        synchronized (this) {
            try {
                int i11 = this.f37414b - 1;
                this.f37414b = i11;
                c0Var = this.f37416d;
                if (i11 == 0) {
                    this.f37415c = 0;
                }
                Intrinsics.d(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b10 = cVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (yt.a aVar : b10) {
            if (aVar != null) {
                l.Companion companion = ut.l.INSTANCE;
                aVar.resumeWith(Unit.f23355a);
            }
        }
        if (c0Var != null) {
            c0Var.y(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [uu.c0, tu.w0] */
    public final c0 k() {
        c0 c0Var;
        synchronized (this) {
            c0 c0Var2 = this.f37416d;
            c0Var = c0Var2;
            if (c0Var2 == null) {
                int i10 = this.f37414b;
                ?? w0Var = new w0(1, Api.BaseClientBuilder.API_PRIORITY_OTHER, su.a.f34777b);
                w0Var.f(Integer.valueOf(i10));
                this.f37416d = w0Var;
                c0Var = w0Var;
            }
        }
        return c0Var;
    }
}
