package nf;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.main.lvl.licensing.util.Base64DecoderException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f28639a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MainActivity mainActivity, yt.a aVar) {
        super(2, aVar);
        this.f28639a = mainActivity;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f28639a, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kq.e] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        MainActivity mainActivity = this.f28639a;
        of.c cVar = mainActivity.f9579n;
        MainActivity mainActivity2 = null;
        if (cVar != null) {
            nj.a aVar2 = new nj.a(mainActivity);
            synchronized (cVar) {
                try {
                    if (cVar.f29983d.a()) {
                        Log.i("LicenseChecker", "Using cached license response");
                        aVar2.a();
                    } else {
                        of.e eVar = new of.e(cVar.f29983d, new Object(), aVar2, of.c.f29979j.nextInt(), cVar.f29985f, cVar.f29986g);
                        if (cVar.f29980a == null) {
                            Log.i("LicenseChecker", "Binding to licensing service.");
                            try {
                                if (cVar.f29982c.bindService(new Intent(new String(pf.a.a("Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U="))).setPackage(new String(pf.a.a("Y29tLmFuZHJvaWQudmVuZGluZw=="))), cVar, 1)) {
                                    cVar.f29988i.offer(eVar);
                                } else {
                                    Log.e("LicenseChecker", "Could not bind to service.");
                                    cVar.b(eVar);
                                }
                            } catch (Base64DecoderException e10) {
                                e10.printStackTrace();
                            } catch (SecurityException unused) {
                                Activity activity = aVar2.f28766a;
                                if (activity instanceof MainActivity) {
                                    mainActivity2 = (MainActivity) activity;
                                }
                                if (mainActivity2 != null) {
                                    mainActivity2.T(true);
                                }
                            }
                        } else {
                            cVar.f29988i.offer(eVar);
                            cVar.c();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return Unit.f23355a;
        }
        Intrinsics.k("licenseChecker");
        throw null;
    }
}
