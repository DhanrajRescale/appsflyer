package kd;

import c0.m0;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kp.j;
import t0.n;
import t0.t;

/* loaded from: classes.dex */
public final class e extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SocialChatListViewModel f23077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f23078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f23079c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f23080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f23081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f23082f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f23083g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23084h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SocialChatListViewModel socialChatListViewModel, m0 m0Var, Function1 function1, Function2 function2, Function0 function0, Function0 function02, Function0 function03, int i10) {
        super(2);
        this.f23077a = socialChatListViewModel;
        this.f23078b = m0Var;
        this.f23079c = function1;
        this.f23080d = function2;
        this.f23081e = function0;
        this.f23082f = function02;
        this.f23083g = function03;
        this.f23084h = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        j.d(this.f23077a, this.f23078b, this.f23079c, this.f23080d, this.f23081e, this.f23082f, this.f23083g, (n) obj, t.H0(this.f23084h | 1));
        return Unit.f23355a;
    }
}
