package jf;

import android.view.KeyEvent;
import ba.a4;
import com.assetgro.stockgro.data.model.CardInteraction;
import com.assetgro.stockgro.data.model.StockGyanCard;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.home.stockgyan.gyan.StockGyanActivity;
import com.assetgro.stockgro.ui.home.stockgyan.gyan.StockGyanViewModel;
import com.assetgro.stockgro.widget.WrapContentViewPager;
import java.util.List;
import me.relex.circleindicator.CircleIndicator;
import vt.p0;

/* loaded from: classes.dex */
public final class c implements x7.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f21345b;

    public /* synthetic */ c(KeyEvent.Callback callback, int i10) {
        this.f21344a = i10;
        this.f21345b = callback;
    }

    @Override // x7.f
    public final void a(int i10) {
    }

    @Override // x7.f
    public final void b(int i10) {
        int i11 = this.f21344a;
        KeyEvent.Callback callback = this.f21345b;
        switch (i11) {
            case 0:
                StockGyanActivity stockGyanActivity = (StockGyanActivity) callback;
                List list = (List) ((StockGyanViewModel) stockGyanActivity.x()).f9569p.getValue();
                if (list != null) {
                    StockGyanCard stockGyanCard = (StockGyanCard) list.get(((a4) stockGyanActivity.w()).f4165w.getCurrentItem());
                    if (((StockGyanViewModel) stockGyanActivity.x()).f9570q.containsKey(stockGyanCard.getId())) {
                        CardInteraction cardInteraction = (CardInteraction) p0.e(stockGyanCard.getId(), ((StockGyanViewModel) stockGyanActivity.x()).f9570q);
                        Integer totalLikes = cardInteraction.getTotalLikes();
                        if (totalLikes != null) {
                            ((a4) stockGyanActivity.w()).f4166x.setText(String.valueOf(totalLikes.intValue()));
                        }
                        if (cardInteraction.isLiked()) {
                            ((a4) stockGyanActivity.w()).f4161s.setImageResource(R.drawable.ic_like);
                            return;
                        } else {
                            ((a4) stockGyanActivity.w()).f4161s.setImageResource(R.drawable.ic_like_unselected);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                ((WrapContentViewPager) callback).requestLayout();
                return;
            default:
                CircleIndicator circleIndicator = (CircleIndicator) callback;
                if (circleIndicator.f27723k.getAdapter() != null && circleIndicator.f27723k.getAdapter().c() > 0) {
                    circleIndicator.a(i10);
                    return;
                }
                return;
        }
    }

    @Override // x7.f
    public final void c(int i10, float f10) {
    }

    public c(WrapContentViewPager wrapContentViewPager) {
        this.f21344a = 1;
        this.f21345b = wrapContentViewPager;
    }
}
