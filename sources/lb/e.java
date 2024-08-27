package lb;

import b0.v;
import b0.z;
import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import com.assetgro.stockgro.ui.social.domain.model.CommentMetaData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import t0.g1;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class e extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommentsViewModel f24429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kb.a f24431c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f24432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f24433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f24434f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function1 f24435g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function1 f24436h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f24437i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f24438j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f24439k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function0 f24440l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g1 f24441m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function1 f24442n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CommentsViewModel commentsViewModel, int i10, kb.a aVar, boolean z10, Function0 function0, Function0 function02, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function0 function03, g1 g1Var, Function1 function16) {
        super(3);
        this.f24429a = commentsViewModel;
        this.f24430b = i10;
        this.f24431c = aVar;
        this.f24432d = z10;
        this.f24433e = function0;
        this.f24434f = function02;
        this.f24435g = function1;
        this.f24436h = function12;
        this.f24437i = function13;
        this.f24438j = function14;
        this.f24439k = function15;
        this.f24440l = function03;
        this.f24441m = g1Var;
        this.f24442n = function16;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        CommentMetaData commentMetaData;
        z ModalBottomSheet = (z) obj;
        t0.n nVar = (t0.n) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((intValue & 81) == 16) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        int i10 = this.f24430b;
        kb.a aVar = this.f24431c;
        boolean z10 = this.f24432d;
        Function0 function0 = this.f24433e;
        Function0 function02 = this.f24434f;
        Function1 function1 = this.f24435g;
        Function1 function12 = this.f24436h;
        Function1 function13 = this.f24437i;
        Function1 function14 = this.f24438j;
        Function1 function15 = this.f24439k;
        Function0 function03 = this.f24440l;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(733328855);
        g1.l lVar = g1.l.f16404b;
        v c10 = b0.s.c(g1.a.f16379a, false, rVar2, 0);
        rVar2.b0(-1323940314);
        int i11 = rVar2.P;
        r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t0.t.v0(rVar2, c10, c2.k.f7749e);
            t0.t.v0(rVar2, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar2, i11, iVar);
            }
            nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
            CommentsViewModel commentsViewModel = this.f24429a;
            String str = commentsViewModel.f8810s;
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            yk.o.d(str, i10, aVar, z10, commentsViewModel.f8809r, function0, function02, function1, function12, function13, function14, function15, function03, rVar2, 14352384, 0, 0);
            g1 g1Var = this.f24441m;
            if (g1Var.getValue() != null && (commentMetaData = (CommentMetaData) g1Var.getValue()) != null) {
                yk.j.m(commentMetaData, this.f24442n, rVar2, 8);
            }
            v.e.y(rVar2, false, true, false, false);
            return Unit.f23355a;
        }
        al.d.v0();
        throw null;
    }
}
