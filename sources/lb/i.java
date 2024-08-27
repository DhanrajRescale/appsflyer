package lb;

import com.assetgro.stockgro.ui.social.domain.model.CommentMetaData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f24455b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CommentMetaData f24456c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Function1 function1, CommentMetaData commentMetaData, int i10) {
        super(0);
        this.f24454a = i10;
        this.f24455b = function1;
        this.f24456c = commentMetaData;
    }

    public final void a() {
        int i10 = this.f24454a;
        CommentMetaData commentMetaData = this.f24456c;
        Function1 function1 = this.f24455b;
        switch (i10) {
            case 0:
                function1.invoke(commentMetaData);
                return;
            case 1:
                function1.invoke(commentMetaData);
                return;
            case 2:
                function1.invoke(commentMetaData.getCommentId());
                return;
            case 3:
                function1.invoke(commentMetaData);
                return;
            default:
                function1.invoke(commentMetaData);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f24454a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            case 2:
                a();
                return Unit.f23355a;
            case 3:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
