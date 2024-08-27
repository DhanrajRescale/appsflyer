package m4;

import android.view.View;
import com.assetgro.stockgro.prod.R;
import d4.n1;
import d4.z0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27476a;

    public /* synthetic */ h(int i10) {
        this.f27476a = i10;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        m mVar;
        switch (this.f27476a) {
            case 0:
                if (view != null) {
                    mVar = (m) view.getTag(R.id.dataBinding);
                } else {
                    mVar = null;
                }
                mVar.f27488b.run();
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = n1.f13788a;
                z0.c(view);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
