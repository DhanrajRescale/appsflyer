package nf;

import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;
import qu.f0;
import vt.p0;

/* loaded from: classes.dex */
public final class n extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f28659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainSharedViewModel f28660b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z10, MainSharedViewModel mainSharedViewModel, yt.a aVar) {
        super(2, aVar);
        this.f28659a = z10;
        this.f28660b = mainSharedViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new n(this.f28659a, this.f28660b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [nf.l] */
    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        boolean z10 = this.f28659a;
        final MainSharedViewModel mainSharedViewModel = this.f28660b;
        if (z10) {
            mainSharedViewModel.f9081d.logoutOffline();
            mainSharedViewModel.f9585p.t0(HttpUrl.FRAGMENT_ENCODE_SET);
            mainSharedViewModel.f9594y.postValue(new kj.j(Unit.f23355a));
        } else {
            at.a logout = mainSharedViewModel.f9081d.logout();
            at.l J = ((kq.e) mainSharedViewModel.f9079b).J();
            logout.getClass();
            if (J != null) {
                final int i10 = 1;
                kt.g gVar = new kt.g(logout, J, 1);
                jf.g gVar2 = new jf.g(11, new k(mainSharedViewModel, i10));
                ll.f fVar = gt.e.f17571c;
                ll.e eVar = gt.e.f17570b;
                kt.i iVar = new kt.i(gVar, gVar2, fVar, eVar, eVar);
                final int i11 = 0;
                kt.i iVar2 = new kt.i(new kt.i(iVar, fVar, fVar, new et.a() { // from class: nf.l
                    @Override // et.a
                    public final void run() {
                        int i12 = i11;
                        MainSharedViewModel mainSharedViewModel2 = mainSharedViewModel;
                        switch (i12) {
                            case 0:
                                mainSharedViewModel2.L.postValue(Boolean.FALSE);
                                return;
                            default:
                                mainSharedViewModel2.R.postValue(new kj.j(p0.d()));
                                return;
                        }
                    }
                }, eVar), fVar, new jf.g(12, new k(mainSharedViewModel, 2)), eVar, eVar);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                at.l lVar = st.e.f34774b;
                if (timeUnit != null) {
                    if (lVar != null) {
                        kt.c cVar = new kt.c(new kt.n(iVar2, 2L, timeUnit, lVar), new jf.g(13, new k(mainSharedViewModel, 3)), 2);
                        jt.c cVar2 = new jt.c(new et.a() { // from class: nf.l
                            @Override // et.a
                            public final void run() {
                                int i12 = i10;
                                MainSharedViewModel mainSharedViewModel2 = mainSharedViewModel;
                                switch (i12) {
                                    case 0:
                                        mainSharedViewModel2.L.postValue(Boolean.FALSE);
                                        return;
                                    default:
                                        mainSharedViewModel2.R.postValue(new kj.j(p0.d()));
                                        return;
                                }
                            }
                        }, new jf.g(14, m.f28652b));
                        cVar.a(cVar2);
                        mainSharedViewModel.f9080c.c(cVar2);
                    } else {
                        throw new NullPointerException("scheduler is null");
                    }
                } else {
                    throw new NullPointerException("unit is null");
                }
            } else {
                throw new NullPointerException("scheduler is null");
            }
        }
        return Unit.f23355a;
    }
}
