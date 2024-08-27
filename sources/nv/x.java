package nv;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
import ut.l;

/* loaded from: classes2.dex */
public final class x implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qu.h f29313b;

    public /* synthetic */ x(qu.i iVar, int i10) {
        this.f29312a = i10;
        this.f29313b = iVar;
    }

    @Override // nv.k
    public final void a(h call, Throwable t10) {
        int i10 = this.f29312a;
        qu.h hVar = this.f29313b;
        switch (i10) {
            case 0:
                Intrinsics.e(call, "call");
                Intrinsics.e(t10, "t");
                l.Companion companion = ut.l.INSTANCE;
                hVar.resumeWith(ut.n.a(t10));
                return;
            case 1:
                Intrinsics.e(call, "call");
                Intrinsics.e(t10, "t");
                l.Companion companion2 = ut.l.INSTANCE;
                hVar.resumeWith(ut.n.a(t10));
                return;
            default:
                Intrinsics.e(call, "call");
                Intrinsics.e(t10, "t");
                l.Companion companion3 = ut.l.INSTANCE;
                hVar.resumeWith(ut.n.a(t10));
                return;
        }
    }

    @Override // nv.k
    public final void b(h call, v0 response) {
        int i10 = this.f29312a;
        qu.h hVar = this.f29313b;
        switch (i10) {
            case 0:
                Intrinsics.e(call, "call");
                Intrinsics.e(response, "response");
                if (response.f29302a.isSuccessful()) {
                    Object obj = response.f29303b;
                    if (obj == null) {
                        Object tag = call.request().tag(v.class);
                        if (tag == null) {
                            Intrinsics.j();
                        }
                        Intrinsics.b(tag, "call.request().tag(Invocation::class.java)!!");
                        StringBuilder sb2 = new StringBuilder("Response from ");
                        Method method = ((v) tag).f29300a;
                        Intrinsics.b(method, "method");
                        Class<?> declaringClass = method.getDeclaringClass();
                        Intrinsics.b(declaringClass, "method.declaringClass");
                        sb2.append(declaringClass.getName());
                        sb2.append('.');
                        sb2.append(method.getName());
                        sb2.append(" was null but response body type was declared as non-null");
                        NullPointerException nullPointerException = new NullPointerException(sb2.toString());
                        l.Companion companion = ut.l.INSTANCE;
                        hVar.resumeWith(ut.n.a(nullPointerException));
                        return;
                    }
                    l.Companion companion2 = ut.l.INSTANCE;
                    hVar.resumeWith(obj);
                    return;
                }
                HttpException httpException = new HttpException(response);
                l.Companion companion3 = ut.l.INSTANCE;
                hVar.resumeWith(ut.n.a(httpException));
                return;
            case 1:
                Intrinsics.e(call, "call");
                Intrinsics.e(response, "response");
                if (response.f29302a.isSuccessful()) {
                    l.Companion companion4 = ut.l.INSTANCE;
                    hVar.resumeWith(response.f29303b);
                    return;
                } else {
                    HttpException httpException2 = new HttpException(response);
                    l.Companion companion5 = ut.l.INSTANCE;
                    hVar.resumeWith(ut.n.a(httpException2));
                    return;
                }
            default:
                Intrinsics.e(call, "call");
                Intrinsics.e(response, "response");
                l.Companion companion6 = ut.l.INSTANCE;
                hVar.resumeWith(response);
                return;
        }
    }
}
