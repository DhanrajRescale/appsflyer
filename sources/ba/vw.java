package ba;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.assetgro.stockgro.data.model.ChatMessage;

/* loaded from: classes.dex */
public abstract class vw extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f6484s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f6485t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6486u;

    /* renamed from: v, reason: collision with root package name */
    public ChatMessage f6487v;

    public vw(Object obj, View view, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(obj, view, 0);
        this.f6484s = constraintLayout;
        this.f6485t = textView;
        this.f6486u = textView2;
    }

    public abstract void r(ChatMessage chatMessage);
}
