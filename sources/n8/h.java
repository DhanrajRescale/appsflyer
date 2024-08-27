package n8;

import android.content.Context;
import bv.b0;
import java.io.File;
import kotlin.jvm.functions.Function0;
import vt.i0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28373a;

    /* renamed from: b, reason: collision with root package name */
    public final y8.c f28374b = d9.d.f14220a;

    /* renamed from: c, reason: collision with root package name */
    public ut.g f28375c = null;

    /* renamed from: d, reason: collision with root package name */
    public ut.g f28376d = null;

    /* renamed from: e, reason: collision with root package name */
    public d9.i f28377e = new d9.i(true, true, true, 4, p8.k.f30751a);

    public h(Context context) {
        this.f28373a = context.getApplicationContext();
    }

    public final o a() {
        Context context = this.f28373a;
        y8.c cVar = this.f28374b;
        ut.g gVar = this.f28375c;
        final int i10 = 0;
        if (gVar == null) {
            gVar = ut.h.a(new Function0(this) { // from class: n8.f

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f28371b;

                {
                    this.f28371b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo2invoke() {
                    q8.l lVar;
                    switch (i10) {
                        case 0:
                            return new w8.b(this.f28371b.f28373a).a();
                        default:
                            h hVar = this.f28371b;
                            d9.k kVar = d9.k.f14237a;
                            Context context2 = hVar.f28373a;
                            synchronized (kVar) {
                                lVar = d9.k.f14238b;
                                if (lVar == null) {
                                    q8.a aVar = new q8.a();
                                    File e10 = fu.k.e(d9.e.c(context2));
                                    String str = b0.f7323b;
                                    aVar.f31823a = gt.d.g(e10);
                                    lVar = aVar.a();
                                    d9.k.f14238b = lVar;
                                }
                            }
                            return lVar;
                    }
                }
            });
        }
        ut.g gVar2 = gVar;
        ut.g gVar3 = this.f28376d;
        if (gVar3 == null) {
            final int i11 = 1;
            gVar3 = ut.h.a(new Function0(this) { // from class: n8.f

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f28371b;

                {
                    this.f28371b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final Object mo2invoke() {
                    q8.l lVar;
                    switch (i11) {
                        case 0:
                            return new w8.b(this.f28371b.f28373a).a();
                        default:
                            h hVar = this.f28371b;
                            d9.k kVar = d9.k.f14237a;
                            Context context2 = hVar.f28373a;
                            synchronized (kVar) {
                                lVar = d9.k.f14238b;
                                if (lVar == null) {
                                    q8.a aVar = new q8.a();
                                    File e10 = fu.k.e(d9.e.c(context2));
                                    String str = b0.f7323b;
                                    aVar.f31823a = gt.d.g(e10);
                                    lVar = aVar.a();
                                    d9.k.f14238b = lVar;
                                }
                            }
                            return lVar;
                    }
                }
            });
        }
        ut.g gVar4 = gVar3;
        ut.g a10 = ut.h.a(new g(i10));
        i0 i0Var = i0.f38321a;
        return new o(context, cVar, gVar2, gVar4, a10, new c(i0Var, i0Var, i0Var, i0Var, i0Var), this.f28377e);
    }
}
