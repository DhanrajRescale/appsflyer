package tb;

import android.content.Intent;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedStreamViewModel f35790b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(FeedStreamViewModel feedStreamViewModel, int i10) {
        super(1);
        this.f35789a = i10;
        this.f35790b = feedStreamViewModel;
    }

    public final void a(e.a result) {
        int i10 = this.f35789a;
        FeedStreamViewModel feedStreamViewModel = this.f35790b;
        boolean z10 = false;
        String str = null;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.f14610a == -1) {
                    Intent intent = result.f14611b;
                    if (intent != null) {
                        str = intent.getStringExtra("GROUP_CHAT_ID");
                    }
                    if (intent != null) {
                        z10 = intent.getBooleanExtra("IS_FOLLOWING", false);
                    }
                    if (str != null) {
                        feedStreamViewModel.o(str, z10);
                        return;
                    }
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.f14610a == -1) {
                    Intent intent2 = result.f14611b;
                    if (intent2 != null) {
                        str = intent2.getStringExtra("GROUP_CHAT_ID");
                    }
                    if (intent2 != null) {
                        z10 = intent2.getBooleanExtra("IS_FOLLOWING", false);
                    }
                    if (str != null) {
                        feedStreamViewModel.o(str, z10);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f35789a;
        FeedStreamViewModel feedStreamViewModel = this.f35790b;
        switch (i10) {
            case 0:
                a((e.a) obj);
                return Unit.f23355a;
            case 1:
                hb.v filter = (hb.v) obj;
                Intrinsics.checkNotNullParameter(filter, "it");
                feedStreamViewModel.getClass();
                Intrinsics.checkNotNullParameter(filter, "filter");
                feedStreamViewModel.k(new sb.r(filter));
                return Unit.f23355a;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                feedStreamViewModel.getClass();
                feedStreamViewModel.k(new sb.u(!booleanValue));
                return Unit.f23355a;
            case 3:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                feedStreamViewModel.k(new sb.z(it));
                return Unit.f23355a;
            default:
                a((e.a) obj);
                return Unit.f23355a;
        }
    }
}
