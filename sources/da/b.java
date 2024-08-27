package da;

import com.assetgro.stockgro.data.LogoutSubject_Factory;
import com.assetgro.stockgro.data.MultipleSignInLogoutSubject_Factory;
import com.assetgro.stockgro.data.TokenInvalidationInterceptor_Factory;
import com.assetgro.stockgro.data.local.preference.UserPreferences_Factory;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.ArenaRepository_Factory;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.ChatRepository_Factory;
import com.assetgro.stockgro.data.repository.ContactsRepository_Factory;
import com.assetgro.stockgro.data.repository.FeedRepository_Factory;
import com.assetgro.stockgro.data.repository.FnoRepository;
import com.assetgro.stockgro.data.repository.FnoRepository_Factory;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository_Factory;
import com.assetgro.stockgro.data.repository.MissionsRepository_Factory;
import com.assetgro.stockgro.data.repository.NotificationsRepository_Factory;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.PaymentRepository_Factory;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.PortfolioRepository_Factory;
import com.assetgro.stockgro.data.repository.SocialAuthRepository_Factory;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.StockRepository_Factory;
import com.assetgro.stockgro.data.repository.TopChartsRepository_Factory;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.data.repository.UserRepository_Factory;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.t;
import com.webengage.sdk.android.Analytics;
import e.l;
import ea.a0;
import ea.p0;
import ea.q0;
import ea.r0;
import ea.w;
import ea.x;
import ea.y;
import ea.z;
import h8.h;
import ls.n0;
import m.a4;

/* loaded from: classes.dex */
public final class b {
    public final xs.b A;
    public final xs.b B;
    public final xs.b C;
    public final xs.b D;
    public final xs.b E;
    public final xs.b F;
    public final xs.b G;

    /* renamed from: a, reason: collision with root package name */
    public final w f14249a;

    /* renamed from: b, reason: collision with root package name */
    public final xs.b f14250b;

    /* renamed from: c, reason: collision with root package name */
    public final xs.b f14251c;

    /* renamed from: d, reason: collision with root package name */
    public final xs.b f14252d;

    /* renamed from: e, reason: collision with root package name */
    public final xs.b f14253e;

    /* renamed from: f, reason: collision with root package name */
    public final xs.b f14254f;

    /* renamed from: g, reason: collision with root package name */
    public final xs.b f14255g = xs.a.a(LogoutSubject_Factory.create());

    /* renamed from: h, reason: collision with root package name */
    public final xs.b f14256h;

    /* renamed from: i, reason: collision with root package name */
    public final TokenInvalidationInterceptor_Factory f14257i;

    /* renamed from: j, reason: collision with root package name */
    public final xs.b f14258j;

    /* renamed from: k, reason: collision with root package name */
    public final q0 f14259k;

    /* renamed from: l, reason: collision with root package name */
    public final xs.b f14260l;

    /* renamed from: m, reason: collision with root package name */
    public final xs.b f14261m;

    /* renamed from: n, reason: collision with root package name */
    public final xs.b f14262n;

    /* renamed from: o, reason: collision with root package name */
    public final xs.b f14263o;

    /* renamed from: p, reason: collision with root package name */
    public final xs.b f14264p;

    /* renamed from: q, reason: collision with root package name */
    public final xs.b f14265q;

    /* renamed from: r, reason: collision with root package name */
    public final xs.b f14266r;

    /* renamed from: s, reason: collision with root package name */
    public final xs.b f14267s;

    /* renamed from: t, reason: collision with root package name */
    public final xs.b f14268t;

    /* renamed from: u, reason: collision with root package name */
    public final xs.b f14269u;

    /* renamed from: v, reason: collision with root package name */
    public final xs.b f14270v;

    /* renamed from: w, reason: collision with root package name */
    public final ContactsRepository_Factory f14271w;

    /* renamed from: x, reason: collision with root package name */
    public final xs.b f14272x;

    /* renamed from: y, reason: collision with root package name */
    public final xs.b f14273y;

    /* renamed from: z, reason: collision with root package name */
    public final xs.b f14274z;

    public b(w wVar, p0 p0Var) {
        this.f14249a = wVar;
        int i10 = 0;
        this.f14250b = xs.a.a(new y(wVar, i10));
        int i11 = 1;
        this.f14251c = xs.a.a(new q0(p0Var, xs.a.a(new r0(p0Var, i10)), i11));
        this.f14252d = xs.a.a(new r0(p0Var, i11));
        this.f14253e = xs.a.a(new hr.c(p0Var, 21));
        this.f14254f = xs.a.a(new l(p0Var, 25));
        xs.b a10 = xs.a.a(MultipleSignInLogoutSubject_Factory.create());
        this.f14256h = a10;
        this.f14257i = TokenInvalidationInterceptor_Factory.create(this.f14255g, a10);
        xs.b a11 = xs.a.a(UserPreferences_Factory.create(xs.a.a(new z(wVar, i11))));
        this.f14258j = a11;
        q0 q0Var = new q0(p0Var, a11, i10);
        this.f14259k = q0Var;
        xs.b a12 = xs.a.a(new x(wVar, xs.a.a(new h(p0Var, this.f14251c, this.f14252d, xs.a.a(new a4(p0Var, this.f14253e, this.f14254f, this.f14250b, this.f14257i, this.f14259k, new t(p0Var, this.f14255g, this.f14258j, xs.a.a(new x(wVar, xs.a.a(new x9.c(i11, p0Var, this.f14251c, xs.a.a(new m.w(p0Var, this.f14253e, this.f14254f, this.f14250b, this.f14257i, q0Var)))), 3)), 6), 1)), 7)), 2));
        this.f14260l = a12;
        this.f14261m = xs.a.a(ChatRepository_Factory.create(a12, this.f14258j));
        xs.b a13 = xs.a.a(new x(wVar, this.f14250b, i11));
        this.f14262n = a13;
        this.f14263o = xs.a.a(UserRepository_Factory.create(this.f14250b, this.f14260l, this.f14258j, this.f14261m, a13));
        this.f14264p = xs.a.a(StockRepository_Factory.create(this.f14260l, this.f14258j));
        this.f14265q = xs.a.a(FollowerRepository_Factory.create(this.f14260l, this.f14258j));
        this.f14266r = xs.a.a(ArenaRepository_Factory.create(this.f14260l));
        this.f14267s = xs.a.a(PortfolioRepository_Factory.create(this.f14260l, this.f14258j));
        this.f14268t = xs.a.a(PaymentRepository_Factory.create(this.f14260l, this.f14258j));
        this.f14269u = xs.a.a(TopChartsRepository_Factory.create(this.f14260l));
        this.f14270v = xs.a.a(NotificationsRepository_Factory.create(this.f14260l));
        this.f14271w = ContactsRepository_Factory.create(this.f14250b, this.f14260l);
        this.f14272x = xs.a.a(FeedRepository_Factory.create(this.f14260l, this.f14258j));
        this.f14273y = xs.a.a(new x(wVar, this.f14250b, 4));
        this.f14274z = xs.a.a(new z(wVar, i10));
        this.A = xs.a.a(new a0(wVar, i11));
        this.B = xs.a.a(new a0(wVar, i10));
        this.C = xs.a.a(new x(wVar, this.f14250b, i10));
        this.D = xs.a.a(SocialAuthRepository_Factory.create(this.f14260l, this.f14258j));
        this.E = xs.a.a(FnoRepository_Factory.create(this.f14260l));
        this.F = xs.a.a(new y(wVar, i11));
        this.G = xs.a.a(MissionsRepository_Factory.create(this.f14260l, this.f14258j));
    }

    public final ArenaRepository a() {
        return (ArenaRepository) this.f14266r.get();
    }

    public final ChatRepository b() {
        return (ChatRepository) this.f14261m.get();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ct.a] */
    public final ct.a c() {
        this.f14249a.getClass();
        return new Object();
    }

    public final FirebaseAnalytics d() {
        return (FirebaseAnalytics) this.f14274z.get();
    }

    public final FnoRepository e() {
        return (FnoRepository) this.E.get();
    }

    public final FollowerRepository f() {
        return (FollowerRepository) this.f14265q.get();
    }

    public final qf.a g() {
        return (qf.a) this.F.get();
    }

    public final n0 h() {
        return (n0) this.f14262n.get();
    }

    public final PaymentRepository i() {
        return (PaymentRepository) this.f14268t.get();
    }

    public final PortfolioRepository j() {
        return (PortfolioRepository) this.f14267s.get();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kq.e] */
    public final kq.e k() {
        this.f14249a.getClass();
        return new Object();
    }

    public final StockRepository l() {
        return (StockRepository) this.f14264p.get();
    }

    public final UserRepository m() {
        return (UserRepository) this.f14263o.get();
    }

    public final jj.a n() {
        return (jj.a) this.C.get();
    }

    public final Analytics o() {
        return (Analytics) this.A.get();
    }
}
