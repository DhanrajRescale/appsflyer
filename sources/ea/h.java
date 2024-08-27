package ea;

import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_market.data.remote.BuySellModifyFnoRequestDto;
import com.assetgro.stockgro.feature_market.data.remote.FnoOrderInfoResponseDto;
import com.assetgro.stockgro.feature_market.data.remote.PortfolioInfo;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;
import t0.g1;
import t0.l3;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15163b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15164c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15167f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f15168g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f15169h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f15170i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        super(0);
        this.f15162a = i10;
        this.f15163b = obj;
        this.f15164c = obj2;
        this.f15165d = obj3;
        this.f15166e = obj4;
        this.f15167f = obj5;
        this.f15168g = obj6;
        this.f15169h = obj7;
        this.f15170i = obj8;
    }

    public final GroupChatViewModel a() {
        int i10 = this.f15162a;
        Object obj = this.f15170i;
        Object obj2 = this.f15169h;
        Object obj3 = this.f15168g;
        Object obj4 = this.f15167f;
        Object obj5 = this.f15166e;
        Object obj6 = this.f15165d;
        Object obj7 = this.f15164c;
        Object obj8 = this.f15163b;
        switch (i10) {
            case 0:
                ct.a aVar = (ct.a) obj7;
                FollowerRepository followerRepository = (FollowerRepository) obj5;
                UserRepository userRepository = (UserRepository) obj3;
                ArenaRepository arenaRepository = (ArenaRepository) obj2;
                return new GroupChatViewModel((androidx.work.i0) obj, arenaRepository, (ChatRepository) obj6, (ContactsRepository) obj4, followerRepository, userRepository, (pj.a) obj8, aVar);
            default:
                return new GroupChatViewModel((androidx.work.i0) obj, (ArenaRepository) obj2, (ChatRepository) obj6, (ContactsRepository) obj4, (FollowerRepository) obj5, (UserRepository) obj3, (pj.a) obj8, (ct.a) obj7);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        PortfolioInfo portfolioInfo;
        String contractSym;
        PortfolioInfo portfolioInfo2;
        String portfolioId;
        String orderId;
        switch (this.f15162a) {
            case 0:
                return a();
            case 1:
                return a();
            default:
                if (((Number) ((g1) this.f15163b).getValue()).intValue() == 0) {
                    str = "Market";
                } else {
                    str = "Limit";
                }
                String str5 = str;
                l3 l3Var = (l3) this.f15167f;
                FnoOrderInfoResponseDto fnoOrderInfoResponseDto = (FnoOrderInfoResponseDto) l3Var.getValue();
                if (fnoOrderInfoResponseDto != null && (orderId = fnoOrderInfoResponseDto.getOrderId()) != null) {
                    str2 = orderId;
                } else {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                FnoOrderInfoResponseDto fnoOrderInfoResponseDto2 = (FnoOrderInfoResponseDto) l3Var.getValue();
                if (fnoOrderInfoResponseDto2 != null && (portfolioInfo2 = fnoOrderInfoResponseDto2.getPortfolioInfo()) != null && (portfolioId = portfolioInfo2.getPortfolioId()) != null) {
                    str3 = portfolioId;
                } else {
                    str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                double z02 = yk.j.z0((l3) this.f15168g);
                FnoOrderInfoResponseDto fnoOrderInfoResponseDto3 = (FnoOrderInfoResponseDto) l3Var.getValue();
                if (fnoOrderInfoResponseDto3 != null && (contractSym = fnoOrderInfoResponseDto3.getContractSym()) != null) {
                    str4 = contractSym;
                } else {
                    str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                int intValue = ((Number) ((l3) this.f15169h).getValue()).intValue();
                FnoOrderInfoResponseDto fnoOrderInfoResponseDto4 = (FnoOrderInfoResponseDto) l3Var.getValue();
                if (fnoOrderInfoResponseDto4 != null && (portfolioInfo = fnoOrderInfoResponseDto4.getPortfolioInfo()) != null) {
                    z10 = portfolioInfo.isModel();
                } else {
                    z10 = true;
                }
                BuySellModifyFnoRequestDto buySellModifyFnoRequestDto = new BuySellModifyFnoRequestDto(str2, str3, null, str4, null, Double.valueOf(z02), intValue, str5, z10, 20, null);
                if (((Boolean) ((g1) this.f15170i).getValue()).booleanValue()) {
                    buySellModifyFnoRequestDto.setStopLossPercentage(kotlin.text.q.e((String) ((g1) this.f15164c).getValue()));
                    buySellModifyFnoRequestDto.setBookProfitPercentage(kotlin.text.q.e((String) ((g1) this.f15165d).getValue()));
                }
                ((Function2) this.f15166e).invoke((FnoOrderInfoResponseDto) l3Var.getValue(), buySellModifyFnoRequestDto);
                return Unit.f23355a;
        }
    }
}
