package ad;

import com.assetgro.stockgro.data.model.WinnersDto;
import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final b f350b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f351c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f352d = new b(2);

    /* renamed from: e, reason: collision with root package name */
    public static final b f353e = new b(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f354a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(1);
        this.f354a = i10;
    }

    public final String a(WinnersDto winnersDto) {
        switch (this.f354a) {
            case 0:
                return winnersDto.getProfileUrl();
            case 1:
                return winnersDto.getDisplayName();
            case 2:
                return winnersDto.getAmount().getAbsolute();
            default:
                return String.valueOf(winnersDto.getRank());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f354a) {
            case 0:
                return a((WinnersDto) obj);
            case 1:
                return a((WinnersDto) obj);
            case 2:
                return a((WinnersDto) obj);
            default:
                return a((WinnersDto) obj);
        }
    }
}
