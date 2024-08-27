package xe;

import com.assetgro.stockgro.data.model.ChampionDto;
import ij.h;
import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f40190b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f40191c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f40192d = new e(2);

    /* renamed from: e, reason: collision with root package name */
    public static final e f40193e = new e(3);

    /* renamed from: f, reason: collision with root package name */
    public static final e f40194f = new e(4);

    /* renamed from: g, reason: collision with root package name */
    public static final e f40195g = new e(5);

    /* renamed from: h, reason: collision with root package name */
    public static final e f40196h = new e(6);

    /* renamed from: i, reason: collision with root package name */
    public static final e f40197i = new e(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40198a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f40198a = i10;
    }

    public final String a(ChampionDto championDto) {
        switch (this.f40198a) {
            case 0:
                return String.valueOf(championDto.getGameStats().getParticipated());
            case 1:
                return String.valueOf(championDto.getGameStats().getWon());
            case 2:
                return championDto.getDisplayPicture();
            case 3:
                return championDto.getDisplayName();
            case 4:
                return championDto.getPoints().getSocial() + " pts";
            case 5:
                h hVar = h.f20067a;
                return h.h(Double.parseDouble(championDto.getProfits().getAbsolute()), 0, false, 6);
            default:
                return championDto.getPoints().getTrade() + " pts";
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f40198a) {
            case 0:
                return a((ChampionDto) obj);
            case 1:
                return a((ChampionDto) obj);
            case 2:
                return a((ChampionDto) obj);
            case 3:
                return a((ChampionDto) obj);
            case 4:
                return a((ChampionDto) obj);
            case 5:
                return a((ChampionDto) obj);
            case 6:
                return a((ChampionDto) obj);
            default:
                ChampionDto championDto = (ChampionDto) obj;
                return Integer.valueOf((int) ((((float) championDto.getGameStats().getWon()) / ((float) championDto.getGameStats().getParticipated())) * 100));
        }
    }
}
