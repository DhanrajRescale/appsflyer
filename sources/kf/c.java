package kf;

import com.assetgro.stockgro.data.model.StockGyanIndex;
import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f23093a = new k(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((StockGyanIndex) obj).getDisplayPicture().getUrl();
    }
}
