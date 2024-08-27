package fv;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f16309b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, int i10) {
        super(1);
        this.f16308a = i10;
        this.f16309b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z10;
        int i10 = this.f16308a;
        m mVar = this.f16309b;
        switch (i10) {
            case 0:
                ((Number) obj).intValue();
                mVar.d("Transport: close");
                mVar.g();
                i iVar = mVar.f16329n;
                if (iVar != null) {
                    iVar.f16305a.cancel(true);
                }
                mVar.f16329n = null;
                if (!mVar.f16332q) {
                    mVar.f16331p.b();
                }
                Iterator it = ((List) mVar.f16325j.f11783c).iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).mo2invoke();
                }
                return Unit.f23355a;
            case 1:
                String m10 = (String) obj;
                Intrinsics.e(m10, "m");
                mVar.getClass();
                mVar.d("Receive: ".concat(m10));
                f fVar = (f) mVar.f16334s.fromJson(m10, f.class);
                if (Intrinsics.a(fVar.d(), mVar.f16330o)) {
                    mVar.f16330o = null;
                }
                ArrayList arrayList = mVar.f16326k;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    e eVar = (e) next;
                    eVar.getClass();
                    if (!(!Intrinsics.a(fVar.f(), eVar.f16288i))) {
                        String event = fVar.a();
                        Intrinsics.e(event, "event");
                        if (Intrinsics.a(event, "phx_join") || Intrinsics.a(event, "phx_leave") || Intrinsics.a(event, "phx_reply") || Intrinsics.a(event, "phx_error") || Intrinsics.a(event, "phx_close")) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (fVar.b() != null && z10 && (!Intrinsics.a(fVar.b(), eVar.f16285f.f16298d))) {
                            eVar.f16289j.d("Channel: Dropping outdated message. " + fVar.f());
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((e) it3.next()).g(fVar);
                }
                Iterator it4 = ((List) mVar.f16325j.f11785e).iterator();
                while (it4.hasNext()) {
                    ((Function1) it4.next()).invoke(fVar);
                }
                return Unit.f23355a;
            default:
                URL it5 = (URL) obj;
                Intrinsics.e(it5, "it");
                return new o(it5, mVar.f16335t);
        }
    }
}
