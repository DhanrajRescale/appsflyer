package com.assetgro.stockgro.ui.splash;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import at.l;
import com.assetgro.stockgro.data.LogoutSubject;
import com.assetgro.stockgro.data.MultipleSignInLogoutSubject;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import hi.c;
import hi.d;
import java.util.concurrent.TimeUnit;
import jj.a;
import kj.j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import mt.f;
import mt.t;
import okhttp3.HttpUrl;
import pt.c0;
import vt.p0;
import zd.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/splash/SplashViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SplashViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final a f10159n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f10160o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10161p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10162q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10163r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f10164s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public SplashViewModel(pj.a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, a appsFlyerAnalyticsEngineImpl, LogoutSubject logoutSubject, MultipleSignInLogoutSubject multipleSignInLogoutSubject) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(appsFlyerAnalyticsEngineImpl, "appsFlyerAnalyticsEngineImpl");
        Intrinsics.checkNotNullParameter(logoutSubject, "logoutSubject");
        Intrinsics.checkNotNullParameter(multipleSignInLogoutSubject, "multipleSignInLogoutSubject");
        this.f10159n = appsFlyerAnalyticsEngineImpl;
        ?? liveData = new LiveData();
        this.f10160o = liveData;
        this.f10161p = new LiveData();
        this.f10162q = new LiveData();
        this.f10163r = new LiveData();
        this.f10164s = new LiveData();
        Pair[] pairArr = new Pair[2];
        String invitationCode = userRepository.getInvitationCode();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        pairArr[0] = new Pair("refcode", invitationCode == null ? HttpUrl.FRAGMENT_ENCODE_SET : invitationCode);
        String currentUserId = userRepository.getCurrentUserId();
        pairArr[1] = new Pair("uuid", currentUserId != null ? currentUserId : str);
        liveData.postValue(new j(p0.f(pairArr)));
        e eVar = (e) schedulerProvider;
        f g10 = logoutSubject.getLogout().g(eVar.J());
        c cVar = new c(0, new d(this, 0));
        gt.d dVar = gt.e.f17572d;
        ll.f fVar = gt.e.f17571c;
        jt.e eVar2 = new jt.e(cVar, dVar);
        g10.e(eVar2);
        compositeDisposable.c(eVar2);
        f g11 = multipleSignInLogoutSubject.getLogout().g(eVar.J());
        jt.e eVar3 = new jt.e(new c(1, new d(this, 1)), dVar);
        g11.e(eVar3);
        compositeDisposable.c(eVar3);
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        l lVar = st.e.f34774b;
        if (timeUnit != null) {
            if (lVar != null) {
                f fVar2 = new f(new t(Math.max(800L, 0L), timeUnit, lVar), new c(2, new g(19, userRepository, this)), 1);
                l J = eVar.J();
                int i10 = at.c.f2779a;
                if (J != null) {
                    gt.e.b(i10, "bufferSize");
                    jt.e eVar4 = new jt.e(fVar, dVar);
                    try {
                        if (J instanceof c0) {
                            fVar2.e(eVar4);
                            return;
                        } else {
                            fVar2.e(new mt.l(eVar4, J.a(), false, i10));
                            return;
                        }
                    } catch (NullPointerException e10) {
                        throw e10;
                    } catch (Throwable th2) {
                        zq.f.l0(th2);
                        yk.g.M(th2);
                        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                        nullPointerException.initCause(th2);
                        throw nullPointerException;
                    }
                }
                throw new NullPointerException("scheduler is null");
            }
            throw new NullPointerException("scheduler is null");
        }
        throw new NullPointerException("unit is null");
    }
}
