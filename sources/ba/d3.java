package ba;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public abstract class d3 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final EditText f4436s;

    /* renamed from: t, reason: collision with root package name */
    public final AppCompatRatingBar f4437t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f4438u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f4439v;

    /* renamed from: w, reason: collision with root package name */
    public final MaterialButton f4440w;

    /* renamed from: x, reason: collision with root package name */
    public final Toolbar f4441x;

    public d3(Object obj, View view, EditText editText, AppCompatRatingBar appCompatRatingBar, ImageView imageView, TextView textView, MaterialButton materialButton, Toolbar toolbar) {
        super(obj, view, 0);
        this.f4436s = editText;
        this.f4437t = appCompatRatingBar;
        this.f4438u = imageView;
        this.f4439v = textView;
        this.f4440w = materialButton;
        this.f4441x = toolbar;
    }
}
