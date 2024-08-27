package androidx.compose.foundation;

import a0.l;
import h2.g;
import iu.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import x.n1;

/* loaded from: classes.dex */
public final class b extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1210a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1211b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f1212c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f1213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z10, String str, g gVar, Function0 function0) {
        super(2);
        this.f1210a = z10;
        this.f1211b = str;
        this.f1212c = gVar;
        this.f1213d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ClickableElement((l) obj, (n1) obj2, this.f1210a, this.f1211b, this.f1212c, this.f1213d);
    }
}
