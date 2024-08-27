package xf;

import android.text.Html;
import android.text.Spanned;
import com.assetgro.stockgro.data.model.KycFAQ;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final h f40213b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f40214c = new h(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40215a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10) {
        super(1);
        this.f40215a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f40215a) {
            case 0:
                Spanned fromHtml = Html.fromHtml(((KycFAQ) obj).getAnswer().getHtml(), 63);
                Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
                return fromHtml;
            default:
                return Html.fromHtml(((KycFAQ) obj).getQuestion().getHtml()).toString();
        }
    }
}
