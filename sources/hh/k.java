package hh;

import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.report.ReportEntityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class k extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public ReportEntityViewModel f18478a;

    /* renamed from: b, reason: collision with root package name */
    public int f18479b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReportEntityViewModel f18480c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f18481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f18482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ReportEntityViewModel reportEntityViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f18480c = reportEntityViewModel;
        this.f18481d = str;
        this.f18482e = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k(this.f18480c, this.f18481d, this.f18482e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        ReportEntityViewModel reportEntityViewModel;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18479b;
        ReportEntityViewModel reportEntityViewModel2 = this.f18480c;
        try {
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, reportEntityViewModel2.f9082e);
        }
        if (i10 != 0) {
            if (i10 == 1) {
                reportEntityViewModel = this.f18478a;
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            String str = reportEntityViewModel2.f10015s;
            if (str != null) {
                String str2 = this.f18481d;
                String str3 = this.f18482e;
                FeedRepository feedRepository = reportEntityViewModel2.f10011o;
                this.f18478a = reportEntityViewModel2;
                this.f18479b = 1;
                obj = feedRepository.reportPostComment(str, str2, str3, this);
                if (obj == aVar) {
                    return aVar;
                }
                reportEntityViewModel = reportEntityViewModel2;
            }
            return Unit.f23355a;
        }
        if (((v0) obj).f29302a.isSuccessful()) {
            reportEntityViewModel.f9084g.postValue(Boolean.FALSE);
            reportEntityViewModel.f10012p.postValue(Boolean.TRUE);
            reportEntityViewModel.f10022z.postValue("Comment has been reported");
        } else {
            reportEntityViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
