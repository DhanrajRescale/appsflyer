package com.assetgro.stockgro.widget.stock_tag_edit_text;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import h.m0;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import k7.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import uj.b;
import uj.c;
import uj.d;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ \u0010\u0011\u001a\u00020\b2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0016R\"\u0010\u0015\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/assetgro/stockgro/widget/stock_tag_edit_text/StockMentionableEditText;", "Landroid/widget/FrameLayout;", "Luj/d;", "Luj/c;", "Landroid/widget/EditText;", "getEditText", "Lke/b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, HttpUrl.FRAGMENT_ENCODE_SET, "setListener", HttpUrl.FRAGMENT_ENCODE_SET, "stock", "setMentionedStock", "Ljava/util/ArrayList;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/collections/ArrayList;", "suggestionList", "setSuggestionList", HttpUrl.FRAGMENT_ENCODE_SET, "b", "Z", "isPopUpWindowShowing", "()Z", "setPopUpWindowShowing", "(Z)V", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockMentionableEditText extends FrameLayout implements d, c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f10762h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10763a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean isPopUpWindowShowing;

    /* renamed from: c, reason: collision with root package name */
    public final StockTagEditText f10765c;

    /* renamed from: d, reason: collision with root package name */
    public final b f10766d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f10767e;

    /* renamed from: f, reason: collision with root package name */
    public View f10768f;

    /* renamed from: g, reason: collision with root package name */
    public PopupWindow f10769g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [k7.z0, uj.b] */
    public StockMentionableEditText(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        new ArrayList();
        this.f10763a = new ArrayList();
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(R.layout.layout_stock_mentionable_edit_text, this);
        this.f10765c = (StockTagEditText) findViewById(R.id.stock_tag_edit_text);
        this.f10767e = new RecyclerView(context, null);
        ?? z0Var = new z0();
        this.f10766d = z0Var;
        z0Var.f37224e = this;
        RecyclerView recyclerView = this.f10767e;
        Intrinsics.c(recyclerView);
        recyclerView.setAdapter(this.f10766d);
        RecyclerView recyclerView2 = this.f10767e;
        Intrinsics.c(recyclerView2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
    }

    @NotNull
    public final EditText getEditText() {
        StockTagEditText stockTagEditText = this.f10765c;
        Intrinsics.d(stockTagEditText, "null cannot be cast to non-null type android.widget.EditText");
        return stockTagEditText;
    }

    public final void setListener(ke.b listener) {
        StockTagEditText stockTagEditText = this.f10765c;
        Intrinsics.c(stockTagEditText);
        stockTagEditText.setListener(listener);
    }

    public final void setMentionedStock(@NotNull String stock) {
        Intrinsics.checkNotNullParameter(stock, "stock");
        this.f10763a.add(stock);
    }

    public final void setPopUpWindowShowing(boolean z10) {
        this.isPopUpWindowShowing = z10;
    }

    @Override // uj.d
    public void setSuggestionList(@NotNull ArrayList<Object> suggestionList) {
        Intrinsics.checkNotNullParameter(suggestionList, "suggestionList");
        if (suggestionList.isEmpty()) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new m0(24, this, suggestionList));
    }
}
