package kb;

import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class s extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommentsViewModel f23063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23064b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(CommentsViewModel commentsViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f23063a = commentsViewModel;
        this.f23064b = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new s(this.f23063a, this.f23064b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        CommentsViewModel commentsViewModel = this.f23063a;
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        try {
            commentsViewModel.i(new i(this.f23064b));
        } catch (Exception e10) {
            commentsViewModel.i(new j(e10.getMessage()));
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
        return Unit.f23355a;
    }
}
