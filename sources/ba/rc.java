package ba;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.assetgro.stockgro.ui.chat.search.user.UserSearchItemViewModel;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class rc extends m4.m {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f5957x = 0;

    /* renamed from: s, reason: collision with root package name */
    public final MaterialButton f5958s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f5959t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f5960u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f5961v;

    /* renamed from: w, reason: collision with root package name */
    public UserSearchItemViewModel f5962w;

    public rc(View view, ImageView imageView, TextView textView, TextView textView2, MaterialButton materialButton, Object obj) {
        super(obj, view, 6);
        this.f5958s = materialButton;
        this.f5959t = textView;
        this.f5960u = imageView;
        this.f5961v = textView2;
    }
}
