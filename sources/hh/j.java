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
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public ReportEntityViewModel f18473a;

    /* renamed from: b, reason: collision with root package name */
    public int f18474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReportEntityViewModel f18475c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f18476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f18477e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ReportEntityViewModel reportEntityViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f18475c = reportEntityViewModel;
        this.f18476d = str;
        this.f18477e = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j(this.f18475c, this.f18476d, this.f18477e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        ReportEntityViewModel reportEntityViewModel;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f18474b;
        ReportEntityViewModel reportEntityViewModel2 = this.f18475c;
        try {
        } catch (Exception unused) {
            v.e.r(R.string.no_internet_connection, reportEntityViewModel2.f9082e);
        }
        if (i10 != 0) {
            if (i10 == 1) {
                reportEntityViewModel = this.f18473a;
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            String str = reportEntityViewModel2.f10015s;
            if (str != null) {
                String str2 = this.f18476d;
                String str3 = this.f18477e;
                FeedRepository feedRepository = reportEntityViewModel2.f10011o;
                this.f18473a = reportEntityViewModel2;
                this.f18474b = 1;
                obj = FeedRepository.reportPost$default(feedRepository, str, str2, null, str3, this, 4, null);
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
            reportEntityViewModel.f10022z.postValue("Post has been reported");
        } else {
            reportEntityViewModel.f9084g.postValue(Boolean.FALSE);
        }
        return Unit.f23355a;
    }
}
