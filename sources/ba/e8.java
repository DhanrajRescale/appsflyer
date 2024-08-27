package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.data.model.ChatMessage;

/* loaded from: classes.dex */
public abstract class e8 extends m4.m {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f4580z = 0;

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f4581s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f4582t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4583u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f4584v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f4585w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f4586x;

    /* renamed from: y, reason: collision with root package name */
    public ChatMessage f4587y;

    public e8(View view, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3, Object obj) {
        super(obj, view, 0);
        this.f4581s = imageView;
        this.f4582t = imageView2;
        this.f4583u = textView;
        this.f4584v = textView2;
        this.f4585w = textView3;
        this.f4586x = imageView3;
    }
}
