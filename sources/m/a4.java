package m;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.assetgro.stockgro.data.TokenInvalidationInterceptor;
import com.assetgro.stockgro.data.remote.BaseInterceptor;
import com.assetgro.stockgro.data.remote.TokenRefreshAuthenticator;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* loaded from: classes.dex */
public final class a4 implements xs.b, bq.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25480a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25481b;

    /* renamed from: c, reason: collision with root package name */
    public Object f25482c;

    /* renamed from: d, reason: collision with root package name */
    public Object f25483d;

    /* renamed from: e, reason: collision with root package name */
    public Object f25484e;

    /* renamed from: f, reason: collision with root package name */
    public Object f25485f;

    /* renamed from: g, reason: collision with root package name */
    public Object f25486g;

    /* renamed from: h, reason: collision with root package name */
    public Object f25487h;

    public a4(int i10) {
        this.f25480a = i10;
    }

    @Override // bq.b
    public final Object a(Class cls) {
        if (((Set) this.f25481b).contains(bq.p.a(cls))) {
            Object a10 = ((bq.b) this.f25487h).a(cls);
            if (!cls.equals(jq.b.class)) {
                return a10;
            }
            return new Object();
        }
        throw new RuntimeException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // bq.b
    public final mq.c b(Class cls) {
        return c(bq.p.a(cls));
    }

    @Override // bq.b
    public final mq.c c(bq.p pVar) {
        if (((Set) this.f25482c).contains(pVar)) {
            return ((bq.b) this.f25487h).c(pVar);
        }
        throw new RuntimeException(String.format("Attempting to request an undeclared dependency Provider<%s>.", pVar));
    }

    @Override // bq.b
    public final mq.c d(bq.p pVar) {
        if (((Set) this.f25485f).contains(pVar)) {
            return ((bq.b) this.f25487h).d(pVar);
        }
        throw new RuntimeException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", pVar));
    }

    @Override // bq.b
    public final Object e(bq.p pVar) {
        if (((Set) this.f25481b).contains(pVar)) {
            return ((bq.b) this.f25487h).e(pVar);
        }
        throw new RuntimeException(String.format("Attempting to request an undeclared dependency %s.", pVar));
    }

    @Override // bq.b
    public final Set f(bq.p pVar) {
        if (((Set) this.f25484e).contains(pVar)) {
            return ((bq.b) this.f25487h).f(pVar);
        }
        throw new RuntimeException(String.format("Attempting to request an undeclared dependency Set<%s>.", pVar));
    }

    @Override // bq.b
    public final mq.b g(bq.p pVar) {
        if (((Set) this.f25483d).contains(pVar)) {
            return ((bq.b) this.f25487h).g(pVar);
        }
        throw new RuntimeException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", pVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f25480a) {
            case 1:
                ea.p0 p0Var = (ea.p0) this.f25481b;
                HttpLoggingInterceptor httpLoggingInterceptor = (HttpLoggingInterceptor) ((Provider) this.f25482c).get();
                long longValue = ((Long) ((Provider) this.f25483d).get()).longValue();
                Context context = (Context) ((Provider) this.f25484e).get();
                TokenInvalidationInterceptor tokenInvalidationInterceptor = (TokenInvalidationInterceptor) ((Provider) this.f25485f).get();
                BaseInterceptor baseInterceptor = (BaseInterceptor) ((Provider) this.f25486g).get();
                TokenRefreshAuthenticator tokenRefreshAuthenticator = (TokenRefreshAuthenticator) ((Provider) this.f25487h).get();
                p0Var.getClass();
                Intrinsics.checkNotNullParameter(httpLoggingInterceptor, "httpLoggingInterceptor");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(tokenInvalidationInterceptor, "tokenInvalidationInterceptor");
                Intrinsics.checkNotNullParameter(baseInterceptor, "baseInterceptor");
                Intrinsics.checkNotNullParameter(tokenRefreshAuthenticator, "tokenRefreshAuthenticator");
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder writeTimeout = builder.readTimeout(longValue, timeUnit).writeTimeout(longValue, timeUnit);
                writeTimeout.addInterceptor(httpLoggingInterceptor).addInterceptor(tokenInvalidationInterceptor).addInterceptor(baseInterceptor).authenticator(tokenRefreshAuthenticator);
                OkHttpClient build = writeTimeout.build();
                yk.g.j(build);
                return build;
            default:
                return new tq.c((pp.g) ((Provider) this.f25481b).get(), (mq.c) ((Provider) this.f25482c).get(), (nq.d) ((Provider) this.f25483d).get(), (mq.c) ((Provider) this.f25484e).get(), (RemoteConfigManager) ((Provider) this.f25485f).get(), (vq.a) ((Provider) this.f25486g).get(), (SessionManager) ((Provider) this.f25487h).get());
        }
    }

    @Override // bq.b
    public final mq.b h(Class cls) {
        return g(bq.p.a(cls));
    }

    public final oq.a i() {
        String str;
        if (((oq.c) this.f25482c) == null) {
            str = " registrationStatus";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (((Long) this.f25485f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f25486g) == null) {
            str = jr.h.r(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new oq.a((String) this.f25481b, (oq.c) this.f25482c, (String) this.f25483d, (String) this.f25484e, ((Long) this.f25485f).longValue(), ((Long) this.f25486g).longValue(), (String) this.f25487h);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final void j(oq.c cVar) {
        if (cVar != null) {
            this.f25482c = cVar;
            return;
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public /* synthetic */ a4(Object obj, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, int i10) {
        this.f25480a = i10;
        this.f25481b = obj;
        this.f25482c = provider;
        this.f25483d = provider2;
        this.f25484e = provider3;
        this.f25485f = provider4;
        this.f25486g = provider5;
        this.f25487h = provider6;
    }

    public a4(oq.a aVar) {
        this.f25480a = 7;
        this.f25481b = aVar.f30247a;
        this.f25482c = aVar.f30248b;
        this.f25483d = aVar.f30249c;
        this.f25484e = aVar.f30250d;
        this.f25485f = Long.valueOf(aVar.f30251e);
        this.f25486g = Long.valueOf(aVar.f30252f);
        this.f25487h = aVar.f30253g;
    }

    public /* synthetic */ a4(ek.q qVar) {
        this.f25480a = 5;
        this.f25481b = this;
        dp.f fVar = new dp.f(qVar);
        this.f25482c = fVar;
        ep.c a10 = ep.b.a(new ll.o(fVar, 11));
        this.f25483d = a10;
        this.f25484e = ep.b.a(new wn.e((ep.c) this.f25482c, a10, 5));
        ep.c a11 = ep.b.a(new dp.d((ep.c) this.f25482c, 0));
        this.f25485f = a11;
        ep.c a12 = ep.b.a(new x9.c(10, (ep.c) this.f25484e, a11, (ep.c) this.f25482c));
        this.f25486g = a12;
        this.f25487h = ep.b.a(new dp.d(a12, 1));
    }

    public a4(bq.a aVar, bq.g gVar) {
        this.f25480a = 6;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (bq.j jVar : aVar.f7240c) {
            int i10 = jVar.f7262c;
            boolean z10 = i10 == 0;
            bq.p pVar = jVar.f7260a;
            if (z10) {
                if (jVar.a()) {
                    hashSet4.add(pVar);
                } else {
                    hashSet.add(pVar);
                }
            } else if (i10 == 2) {
                hashSet3.add(pVar);
            } else if (jVar.a()) {
                hashSet5.add(pVar);
            } else {
                hashSet2.add(pVar);
            }
        }
        Set set = aVar.f7244g;
        if (!set.isEmpty()) {
            hashSet.add(bq.p.a(jq.b.class));
        }
        this.f25481b = Collections.unmodifiableSet(hashSet);
        this.f25482c = Collections.unmodifiableSet(hashSet2);
        this.f25483d = Collections.unmodifiableSet(hashSet3);
        this.f25484e = Collections.unmodifiableSet(hashSet4);
        this.f25485f = Collections.unmodifiableSet(hashSet5);
        this.f25486g = set;
        this.f25487h = gVar;
    }

    public a4(Context context) {
        this.f25480a = 0;
        this.f25484e = new WindowManager.LayoutParams();
        this.f25485f = new Rect();
        this.f25486g = new int[2];
        this.f25487h = new int[2];
        this.f25481b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f25482c = inflate;
        this.f25483d = (TextView) inflate.findViewById(R.id.message);
        ((WindowManager.LayoutParams) this.f25484e).setTitle(a4.class.getSimpleName());
        ((WindowManager.LayoutParams) this.f25484e).packageName = ((Context) this.f25481b).getPackageName();
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.f25484e;
        layoutParams.type = CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2132082693;
        layoutParams.flags = 24;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4(oq.a aVar, int i10) {
        this(aVar);
        this.f25480a = 7;
    }

    public a4(dk.c cVar, dk.c cVar2, dk.c cVar3, dk.c cVar4, ak.w wVar, ak.y yVar) {
        this.f25480a = 2;
        this.f25487h = sk.d.a(150, new hr.c(this, 24));
        this.f25481b = cVar;
        this.f25482c = cVar2;
        this.f25483d = cVar3;
        this.f25484e = cVar4;
        this.f25485f = wVar;
        this.f25486g = yVar;
    }
}
