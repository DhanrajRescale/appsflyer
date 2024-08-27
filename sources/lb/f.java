package lb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import com.assetgro.stockgro.prod.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import qu.f0;
import t0.l3;

/* loaded from: classes.dex */
public final class f extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l3 f24443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommentsViewModel f24444b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f24445c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f24446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l3 f24448f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f24449g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l3 l3Var, CommentsViewModel commentsViewModel, Function2 function2, String str, int i10, l3 l3Var2, Context context, yt.a aVar) {
        super(2, aVar);
        this.f24443a = l3Var;
        this.f24444b = commentsViewModel;
        this.f24445c = function2;
        this.f24446d = str;
        this.f24447e = i10;
        this.f24448f = l3Var2;
        this.f24449g = context;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new f(this.f24443a, this.f24444b, this.f24445c, this.f24446d, this.f24447e, this.f24448f, this.f24449g, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        kb.c cVar = (kb.c) this.f24443a.getValue();
        if (cVar != null) {
            int ordinal = cVar.ordinal();
            if (ordinal != 0) {
                l3 l3Var = this.f24448f;
                Context context = this.f24449g;
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        String text = ((kb.b) l3Var.getValue()).f23029f;
                        if (text != null) {
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter(text, "text");
                            if (text.length() != 0) {
                                Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                                Object systemService = context.getSystemService("layout_inflater");
                                Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                                View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                                w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                            }
                        }
                        this.f24445c.invoke(this.f24446d, new Integer(this.f24447e));
                    }
                } else {
                    String text2 = ((kb.b) l3Var.getValue()).f23030g;
                    if (text2 != null) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(text2, "text");
                        if (text2.length() != 0) {
                            Toast makeText2 = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                            Object systemService2 = context.getSystemService("layout_inflater");
                            Intrinsics.d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
                            View inflate2 = ((LayoutInflater) systemService2).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                            w.k.c(text2, (TextView) inflate2.findViewById(R.id.message), makeText2, inflate2);
                        }
                    }
                }
            } else {
                this.f24444b.h(kb.a.f23021b);
            }
        }
        return Unit.f23355a;
    }
}
