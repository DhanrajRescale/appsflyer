package hf;

import com.assetgro.stockgro.data.AnalyticEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f18432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AnalyticEvent f18433c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, Function2 function2, AnalyticEvent analyticEvent) {
        super(0);
        this.f18431a = str;
        this.f18432b = function2;
        this.f18433c = analyticEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        String str = this.f18431a;
        if (str.length() > 0) {
            this.f18432b.invoke(str, this.f18433c);
        }
        return Unit.f23355a;
    }
}
