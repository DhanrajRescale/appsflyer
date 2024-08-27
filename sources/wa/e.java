package wa;

import com.assetgro.stockgro.feature_market.data.remote.FnoOptionDto;
import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f38902b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f38903c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f38904d = new e(2);

    /* renamed from: e, reason: collision with root package name */
    public static final e f38905e = new e(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38906a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f38906a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f38906a;
        switch (i10) {
            case 0:
                FnoOptionDto fnoOptionDto = (FnoOptionDto) obj;
                switch (i10) {
                    case 0:
                        return fnoOptionDto.getImageUrl();
                    default:
                        return fnoOptionDto.getImageUrl();
                }
            case 1:
                FnoOptionDto fnoOptionDto2 = (FnoOptionDto) obj;
                switch (i10) {
                    case 1:
                        return fnoOptionDto2.getChange();
                    default:
                        return fnoOptionDto2.getChange();
                }
            case 2:
                FnoOptionDto fnoOptionDto3 = (FnoOptionDto) obj;
                switch (i10) {
                    case 0:
                        return fnoOptionDto3.getImageUrl();
                    default:
                        return fnoOptionDto3.getImageUrl();
                }
            default:
                FnoOptionDto fnoOptionDto4 = (FnoOptionDto) obj;
                switch (i10) {
                    case 1:
                        return fnoOptionDto4.getChange();
                    default:
                        return fnoOptionDto4.getChange();
                }
        }
    }
}
