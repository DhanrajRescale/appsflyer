package yb;

import com.assetgro.stockgro.ui.home.homepage.data.HomeSocialTradeViewDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class o extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeSocialTradeViewDto.TradeViewElement f41452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f41453b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(HomeSocialTradeViewDto.TradeViewElement tradeViewElement, Function2 function2) {
        super(0);
        this.f41452a = tradeViewElement;
        this.f41453b = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        String groupId;
        HomeSocialTradeViewDto.TradeViewElement tradeViewElement = this.f41452a;
        String postId = tradeViewElement.getPostId();
        if (postId != null && postId.length() != 0 && (groupId = tradeViewElement.getGroupId()) != null && groupId.length() != 0) {
            String postId2 = tradeViewElement.getPostId();
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (postId2 == null) {
                postId2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String groupId2 = tradeViewElement.getGroupId();
            if (groupId2 != null) {
                str = groupId2;
            }
            this.f41453b.invoke(postId2, str);
        }
        return Unit.f23355a;
    }
}
