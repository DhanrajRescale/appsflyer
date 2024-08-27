package androidx.compose.foundation;

import a0.l;
import h2.g;
import iu.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import x.n1;

/* loaded from: classes.dex */
public final class c extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f1216c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f1217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f1218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f1219f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f1220g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, String str, String str2, Function0 function0, Function0 function02, Function0 function03, boolean z10) {
        super(2);
        this.f1214a = z10;
        this.f1215b = str;
        this.f1216c = gVar;
        this.f1217d = function0;
        this.f1218e = str2;
        this.f1219f = function02;
        this.f1220g = function03;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n1 n1Var = (n1) obj2;
        boolean z10 = this.f1214a;
        String str = this.f1215b;
        return new CombinedClickableElement(n1Var, (l) obj, this.f1216c, str, this.f1218e, this.f1217d, this.f1219f, this.f1220g, z10);
    }
}
