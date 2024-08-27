package se;

import com.assetgro.stockgro.data.remote.response.SocialSearchHistoryItem;
import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f34603a = new k(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((SocialSearchHistoryItem) obj).getSearchQuery();
    }
}
