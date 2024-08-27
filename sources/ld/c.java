package ld;

import com.assetgro.stockgro.data.model.UserChatGroup;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.t;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserChatGroup f24539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24541c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f24542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f24543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f24544f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f24545g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Pair f24546h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f24547i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f24548j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f24549k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UserChatGroup userChatGroup, String str, String str2, String str3, String str4, int i10, int i11, Pair pair, Function1 function1, Function2 function2, int i12) {
        super(2);
        this.f24539a = userChatGroup;
        this.f24540b = str;
        this.f24541c = str2;
        this.f24542d = str3;
        this.f24543e = str4;
        this.f24544f = i10;
        this.f24545g = i11;
        this.f24546h = pair;
        this.f24547i = function1;
        this.f24548j = function2;
        this.f24549k = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        kp.j.b(this.f24539a, this.f24540b, this.f24541c, this.f24542d, this.f24543e, this.f24544f, this.f24545g, this.f24546h, this.f24547i, this.f24548j, (t0.n) obj, t.H0(this.f24549k | 1));
        return Unit.f23355a;
    }
}
