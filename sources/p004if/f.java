package p004if;

import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.model.TopPortfolioDto;
import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final f f19958b = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f19959c = new f(1);

    /* renamed from: d, reason: collision with root package name */
    public static final f f19960d = new f(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19961a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10) {
        super(1);
        this.f19961a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f19961a;
        switch (i10) {
            case 0:
                TopPortfolioDto topPortfolioDto = (TopPortfolioDto) obj;
                double value = topPortfolioDto.getValue();
                double percentage = topPortfolioDto.getPercentage();
                String type = topPortfolioDto.getType();
                if (type == null) {
                    type = "POSITIVE";
                }
                return new ChangeDto(value, percentage, type, null);
            case 1:
                TopPortfolioDto topPortfolioDto2 = (TopPortfolioDto) obj;
                switch (i10) {
                    case 1:
                        return topPortfolioDto2.getImageUrl();
                    default:
                        return topPortfolioDto2.getName();
                }
            default:
                TopPortfolioDto topPortfolioDto3 = (TopPortfolioDto) obj;
                switch (i10) {
                    case 1:
                        return topPortfolioDto3.getImageUrl();
                    default:
                        return topPortfolioDto3.getName();
                }
        }
    }
}
