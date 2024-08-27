package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.data.model.ChatMessage;

/* loaded from: classes.dex */
public abstract class vx extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f6488s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f6489t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6490u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f6491v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f6492w;

    /* renamed from: x, reason: collision with root package name */
    public ChatMessage f6493x;

    public vx(Object obj, View view, ImageView imageView, TextView textView, TextView textView2, TextView textView3, ImageView imageView2) {
        super(obj, view, 0);
        this.f6488s = imageView;
        this.f6489t = textView;
        this.f6490u = textView2;
        this.f6491v = textView3;
        this.f6492w = imageView2;
    }

    public abstract void r(ChatMessage chatMessage);
}
