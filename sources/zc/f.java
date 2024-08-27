package zc;

import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.data.model.LeaderBoard;
import com.assetgro.stockgro.data.model.LeaderBoardUserDto;
import com.assetgro.stockgro.data.model.TopLeaguesDto;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vt.y;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final f f42366b = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f42367c = new f(1);

    /* renamed from: d, reason: collision with root package name */
    public static final f f42368d = new f(2);

    /* renamed from: e, reason: collision with root package name */
    public static final f f42369e = new f(3);

    /* renamed from: f, reason: collision with root package name */
    public static final f f42370f = new f(4);

    /* renamed from: g, reason: collision with root package name */
    public static final f f42371g = new f(5);

    /* renamed from: h, reason: collision with root package name */
    public static final f f42372h = new f(6);

    /* renamed from: i, reason: collision with root package name */
    public static final f f42373i = new f(7);

    /* renamed from: j, reason: collision with root package name */
    public static final f f42374j = new f(8);

    /* renamed from: k, reason: collision with root package name */
    public static final f f42375k = new f(9);

    /* renamed from: l, reason: collision with root package name */
    public static final f f42376l = new f(10);

    /* renamed from: m, reason: collision with root package name */
    public static final f f42377m = new f(11);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42378a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10) {
        super(1);
        this.f42378a = i10;
    }

    public final Boolean a(LeaderBoard leaderBoard) {
        List<LeaderBoardUserDto> leaderBoardEntries;
        List<LeaderBoardUserDto> leaderBoardEntries2;
        boolean z10 = true;
        boolean z11 = false;
        switch (this.f42378a) {
            case 7:
                if (leaderBoard != null && (leaderBoardEntries = leaderBoard.getLeaderBoardEntries()) != null) {
                    z11 = !leaderBoardEntries.isEmpty();
                }
                return Boolean.valueOf(z11);
            case 8:
                if (leaderBoard != null && (leaderBoardEntries2 = leaderBoard.getLeaderBoardEntries()) != null && !leaderBoardEntries2.isEmpty()) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return Boolean.FALSE;
        }
    }

    public final List d(LeaderBoard leaderBoard) {
        switch (this.f42378a) {
            case 10:
                ArrayList arrayList = new ArrayList();
                List<LeaderBoardUserDto> leaderBoardEntries = leaderBoard.getLeaderBoardEntries();
                if (leaderBoardEntries != null && !leaderBoardEntries.isEmpty()) {
                    int i10 = 0;
                    for (Object obj : leaderBoard.getLeaderBoardEntries()) {
                        int i11 = i10 + 1;
                        if (i10 >= 0) {
                            arrayList.add("Day " + i11);
                            i10 = i11;
                        } else {
                            y.j();
                            throw null;
                        }
                    }
                }
                return arrayList;
            default:
                List<LeaderBoardUserDto> leaderBoardEntries2 = leaderBoard.getLeaderBoardEntries();
                if (leaderBoardEntries2 != null && !leaderBoardEntries2.isEmpty()) {
                    return leaderBoard.getLeaderBoardEntries();
                }
                return new ArrayList();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        int i11 = this.f42378a;
        switch (i11) {
            case 0:
                return Unit.f23355a;
            case 1:
                LeaderBoardUserDto leaderBoardUserDto = (LeaderBoardUserDto) obj;
                switch (i11) {
                    case 1:
                        return leaderBoardUserDto.getImageUrl();
                    default:
                        return leaderBoardUserDto.getRank();
                }
            case 2:
                LeaderBoardUserDto leaderBoardUserDto2 = (LeaderBoardUserDto) obj;
                return new ChangeDto(leaderBoardUserDto2.getPortfolioDetails().getValue(), leaderBoardUserDto2.getPortfolioDetails().getPercentage(), leaderBoardUserDto2.getPortfolioDetails().getType(), leaderBoardUserDto2.getPortfolioDetails().getPortfolioId());
            case 3:
                LeaderBoardUserDto leaderBoardUserDto3 = (LeaderBoardUserDto) obj;
                switch (i11) {
                    case 1:
                        return leaderBoardUserDto3.getImageUrl();
                    default:
                        return leaderBoardUserDto3.getRank();
                }
            case 4:
                return ((TopLeaguesDto) obj).getCurrentUser();
            case 5:
                String frequency = ((LeaderBoard) obj).getFrequency();
                if (Intrinsics.a(frequency, "weekly")) {
                    i10 = R.string.weekly_leader_board;
                } else if (Intrinsics.a(frequency, "monthly")) {
                    i10 = R.string.monthly_leader_board;
                } else {
                    i10 = R.string.today_leader_board;
                }
                return Integer.valueOf(i10);
            case 6:
                return Unit.f23355a;
            case 7:
                return a((LeaderBoard) obj);
            case 8:
                return a((LeaderBoard) obj);
            case 9:
                return a((LeaderBoard) obj);
            case 10:
                return d((LeaderBoard) obj);
            default:
                return d((LeaderBoard) obj);
        }
    }
}
