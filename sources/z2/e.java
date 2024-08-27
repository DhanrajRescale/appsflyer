package z2;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.data.repository.PaymentRepository;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainViewModel;
import com.assetgro.stockgro.ui.portfolio.unlock.detail.UnlockPortfolioDetailViewModel;
import com.assetgro.stockgro.ui.profile.report.ReportEntityViewModel;
import com.assetgro.stockgro.ui.profile.self.ImageCropActivity;
import com.assetgro.stockgro.ui.social.presentation.block.BlockedUserListViewModel;
import com.assetgro.stockgro.ui.stock.cover.order.StockCoverOrderViewModel;
import com.assetgro.stockgro.ui.stock.detail.order.StockOrderViewModel;
import com.assetgro.stockgro.ui.stock.sell.StockSellViewModel;
import com.assetgro.stockgro.ui.stock.shortSell.order.StockShortSellOrderViewModel;
import com.assetgro.stockgro.ui.subscription.SubscriptionPlanConfirmationViewModel;
import com.assetgro.stockgro.ui.subscription.purchase.SubscriptionPurchaseStatusViewModel;
import com.takusemba.cropme.CropLayout;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41923c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f41925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f41926f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(0);
        this.f41921a = i10;
        this.f41922b = obj;
        this.f41923c = obj2;
        this.f41924d = obj3;
        this.f41925e = obj4;
        this.f41926f = obj5;
    }

    public final void a() {
        int i10 = this.f41921a;
        Object obj = this.f41922b;
        Object obj2 = this.f41926f;
        Object obj3 = this.f41925e;
        Object obj4 = this.f41924d;
        Object obj5 = this.f41923c;
        switch (i10) {
            case 0:
                ((r) obj).j((Function0) obj5, (u) obj4, (String) obj3, (w2.k) obj2);
                return;
            default:
                Rect rect = (Rect) obj4;
                RectF rectF = (RectF) obj3;
                try {
                    ((Handler) obj2).post(new m.j(this, Bitmap.createBitmap(Bitmap.createScaledBitmap((Bitmap) obj5, rect.width(), rect.height(), false), (int) (rectF.left - rect.left), (int) (rectF.top - rect.top), (int) rectF.width(), (int) rectF.height()), 21));
                    return;
                } catch (Exception e10) {
                    Iterator it = ((CropLayout) obj).f12123d.iterator();
                    while (it.hasNext()) {
                        ih.n nVar = (ih.n) it.next();
                        nVar.getClass();
                        Intrinsics.checkNotNullParameter(e10, "e");
                        ImageCropActivity context = nVar.f20018a;
                        String text = context.getString(R.string.upload_failed);
                        Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(text, "text");
                        if (text.length() != 0) {
                            Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                            Object systemService = context.getSystemService("layout_inflater");
                            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                            w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                        }
                    }
                    return;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f41921a;
        Object obj = this.f41926f;
        Object obj2 = this.f41925e;
        Object obj3 = this.f41924d;
        Object obj4 = this.f41923c;
        Object obj5 = this.f41922b;
        switch (i10) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                return new BlockedUserListViewModel((pj.a) obj5, (ct.a) obj4, (UserRepository) obj3, (ChatRepository) obj2, (qf.a) obj);
            case 2:
                return new MainViewModel((pj.a) obj5, (ct.a) obj4, (UserRepository) obj3, (mj.a) obj2, (qf.a) obj);
            case 3:
                return new ReportEntityViewModel((pj.a) obj5, (ct.a) obj4, (UserRepository) obj3, (ChatRepository) obj2, (FeedRepository) obj);
            case 4:
                return new StockCoverOrderViewModel((pj.a) obj5, (ct.a) obj4, (StockRepository) obj3, (mt.p) obj2, (UserRepository) obj);
            case 5:
                return new StockOrderViewModel((pj.a) obj5, (ct.a) obj4, (StockRepository) obj3, (mt.p) obj2, (UserRepository) obj);
            case 6:
                return new StockSellViewModel((pj.a) obj5, (ct.a) obj4, (StockRepository) obj3, (mt.p) obj2, (UserRepository) obj);
            case 7:
                return new StockShortSellOrderViewModel((pj.a) obj5, (ct.a) obj4, (StockRepository) obj3, (mt.p) obj2, (UserRepository) obj);
            case 8:
                return new SubscriptionPlanConfirmationViewModel((pj.a) obj5, (ct.a) obj4, (UserRepository) obj3, (PaymentRepository) obj2, (qf.a) obj);
            case 9:
                return new SubscriptionPurchaseStatusViewModel((pj.a) obj5, (ct.a) obj4, (UserRepository) obj3, (PaymentRepository) obj2, (jj.a) obj);
            case 10:
                return new UnlockPortfolioDetailViewModel((pj.a) obj5, (ct.a) obj4, (PortfolioRepository) obj3, (PaymentRepository) obj2, (UserRepository) obj);
            default:
                a();
                return Unit.f23355a;
        }
    }
}
