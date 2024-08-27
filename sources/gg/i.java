package gg;

import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.PortfolioRepository;
import com.assetgro.stockgro.ui.portfolio.PortfolioViewModel;
import com.assetgro.stockgro.ui.portfolio.v2.data.remote.PortfolioSectionDto;
import com.assetgro.stockgro.ui.portfolio.v2.data.remote.PortfoliosDto;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import iu.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class i extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PortfolioViewModel f17408b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f17409c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f17410d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PortfolioViewModel portfolioViewModel, z zVar, z zVar2, yt.a aVar) {
        super(2, aVar);
        this.f17408b = portfolioViewModel;
        this.f17409c = zVar;
        this.f17410d = zVar2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i(this.f17408b, this.f17409c, this.f17410d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        BaseResponseDto baseResponseDto;
        PortfoliosDto portfoliosDto;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17407a;
        PortfolioViewModel portfolioViewModel = this.f17408b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                PortfolioRepository portfolioRepository = portfolioViewModel.f9771n;
                this.f17407a = 1;
                obj = portfolioRepository.getPortfoliosV2(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful() && (baseResponseDto = (BaseResponseDto) v0Var.f29303b) != null && (portfoliosDto = (PortfoliosDto) baseResponseDto.getData()) != null) {
                z zVar = this.f17409c;
                z zVar2 = this.f17410d;
                zVar.f20560a = portfoliosDto.getModelPortfoliosSection();
                PortfolioSectionDto leaguePortfoliosSection = portfoliosDto.getLeaguePortfoliosSection();
                if (leaguePortfoliosSection != null) {
                    zVar2.f20560a = leaguePortfoliosSection;
                }
                portfolioViewModel.i(new g((PortfolioSectionDto) zVar.f20560a, (PortfolioSectionDto) zVar2.f20560a));
            }
        } catch (Exception e10) {
            FirebaseCrashlytics.getInstance().recordException(e10);
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
