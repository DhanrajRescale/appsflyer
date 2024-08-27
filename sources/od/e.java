package od;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.j0;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import ba.dg;
import ba.ug;
import com.assetgro.stockgro.data.enums.GroupImageType;
import com.assetgro.stockgro.data.model.CharLimit;
import com.assetgro.stockgro.data.model.DiscoverCategory;
import com.assetgro.stockgro.data.model.SocialChatGroup;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import com.bumptech.glide.g;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import eb.f;
import gd.m;
import iu.a0;
import java.io.File;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nt.h;
import okhttp3.HttpUrl;
import qu.i0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lod/e;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/chat/create/GroupCreateViewModel;", "Lba/ug;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends m<GroupCreateViewModel, ug> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f29968k = 0;

    /* renamed from: g, reason: collision with root package name */
    public final e.c f29969g;

    /* renamed from: h, reason: collision with root package name */
    public final e.c f29970h;

    /* renamed from: i, reason: collision with root package name */
    public final e.c f29971i;

    /* renamed from: j, reason: collision with root package name */
    public final e.c f29972j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [f.a, java.lang.Object] */
    public e() {
        final int i10 = 0;
        e.c registerForActivityResult = registerForActivityResult(new Object(), new e.b(this) { // from class: od.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f29960b;

            {
                this.f29960b = this;
            }

            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Intent intent2;
                Uri data;
                Intent intent3;
                Intent intent4;
                Uri data2;
                int i11 = i10;
                Object obj2 = null;
                e this$0 = this.f29960b;
                switch (i11) {
                    case 0:
                        e.a aVar = (e.a) obj;
                        int i12 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                obj2 = extras.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap = (Bitmap) obj2;
                            ((g) com.bumptech.glide.b.g(this$0).j().C(bitmap).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType = GroupImageType.Display;
                            groupCreateViewModel.h(groupImageType);
                            ((GroupCreateViewModel) this$0.r()).f9127z = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap);
                            File file = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file, groupImageType);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Uri uri = (Uri) obj;
                        int i13 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri != null) {
                            ((g) com.bumptech.glide.b.g(this$0).l(uri).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel2 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType2 = GroupImageType.Display;
                            groupCreateViewModel2.h(groupImageType2);
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).f9127z = new File(vl.b.z(requireContext, uri));
                            File file2 = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file2 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file2, groupImageType2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        Uri uri2 = (Uri) obj;
                        int i14 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            com.bumptech.glide.b.g(this$0).l(uri2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel3 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType3 = GroupImageType.Cover;
                            groupCreateViewModel3.h(groupImageType3);
                            Context requireContext2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).A = new File(vl.b.z(requireContext2, uri2));
                            File file3 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file3 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file3, groupImageType3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        e.a aVar2 = (e.a) obj;
                        int i15 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1 && (intent2 = aVar2.f14611b) != null && (data = intent2.getData()) != null) {
                            ((g) com.bumptech.glide.b.g(this$0).l(data).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel4 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType4 = GroupImageType.Display;
                            groupCreateViewModel4.h(groupImageType4);
                            Context requireContext3 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).f9127z = new File(vl.b.z(requireContext3, data));
                            File file4 = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file4 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file4, groupImageType4);
                                return;
                            }
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar3 = (e.a) obj;
                        int i16 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent3 = aVar3.f14611b) != null) {
                            Bundle extras2 = intent3.getExtras();
                            if (extras2 != null) {
                                obj2 = extras2.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap2 = (Bitmap) obj2;
                            com.bumptech.glide.b.g(this$0).j().C(bitmap2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel5 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType5 = GroupImageType.Cover;
                            groupCreateViewModel5.h(groupImageType5);
                            ((GroupCreateViewModel) this$0.r()).A = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap2);
                            File file5 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file5 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file5, groupImageType5);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e.a aVar4 = (e.a) obj;
                        int i17 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar4.f14610a == -1 && (intent4 = aVar4.f14611b) != null && (data2 = intent4.getData()) != null) {
                            com.bumptech.glide.b.g(this$0).l(data2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel6 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType6 = GroupImageType.Cover;
                            groupCreateViewModel6.h(groupImageType6);
                            Context requireContext4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).A = new File(vl.b.z(requireContext4, data2));
                            File file6 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file6 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file6, groupImageType6);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f29969g = registerForActivityResult;
        final int i11 = 1;
        e.c registerForActivityResult2 = registerForActivityResult(new Object(), new e.b(this) { // from class: od.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f29960b;

            {
                this.f29960b = this;
            }

            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Intent intent2;
                Uri data;
                Intent intent3;
                Intent intent4;
                Uri data2;
                int i112 = i11;
                Object obj2 = null;
                e this$0 = this.f29960b;
                switch (i112) {
                    case 0:
                        e.a aVar = (e.a) obj;
                        int i12 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                obj2 = extras.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap = (Bitmap) obj2;
                            ((g) com.bumptech.glide.b.g(this$0).j().C(bitmap).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType = GroupImageType.Display;
                            groupCreateViewModel.h(groupImageType);
                            ((GroupCreateViewModel) this$0.r()).f9127z = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap);
                            File file = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file, groupImageType);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Uri uri = (Uri) obj;
                        int i13 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri != null) {
                            ((g) com.bumptech.glide.b.g(this$0).l(uri).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel2 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType2 = GroupImageType.Display;
                            groupCreateViewModel2.h(groupImageType2);
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).f9127z = new File(vl.b.z(requireContext, uri));
                            File file2 = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file2 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file2, groupImageType2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        Uri uri2 = (Uri) obj;
                        int i14 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            com.bumptech.glide.b.g(this$0).l(uri2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel3 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType3 = GroupImageType.Cover;
                            groupCreateViewModel3.h(groupImageType3);
                            Context requireContext2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).A = new File(vl.b.z(requireContext2, uri2));
                            File file3 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file3 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file3, groupImageType3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        e.a aVar2 = (e.a) obj;
                        int i15 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1 && (intent2 = aVar2.f14611b) != null && (data = intent2.getData()) != null) {
                            ((g) com.bumptech.glide.b.g(this$0).l(data).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel4 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType4 = GroupImageType.Display;
                            groupCreateViewModel4.h(groupImageType4);
                            Context requireContext3 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).f9127z = new File(vl.b.z(requireContext3, data));
                            File file4 = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file4 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file4, groupImageType4);
                                return;
                            }
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar3 = (e.a) obj;
                        int i16 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent3 = aVar3.f14611b) != null) {
                            Bundle extras2 = intent3.getExtras();
                            if (extras2 != null) {
                                obj2 = extras2.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap2 = (Bitmap) obj2;
                            com.bumptech.glide.b.g(this$0).j().C(bitmap2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel5 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType5 = GroupImageType.Cover;
                            groupCreateViewModel5.h(groupImageType5);
                            ((GroupCreateViewModel) this$0.r()).A = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap2);
                            File file5 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file5 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file5, groupImageType5);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e.a aVar4 = (e.a) obj;
                        int i17 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar4.f14610a == -1 && (intent4 = aVar4.f14611b) != null && (data2 = intent4.getData()) != null) {
                            com.bumptech.glide.b.g(this$0).l(data2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel6 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType6 = GroupImageType.Cover;
                            groupCreateViewModel6.h(groupImageType6);
                            Context requireContext4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).A = new File(vl.b.z(requireContext4, data2));
                            File file6 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file6 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file6, groupImageType6);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResult(...)");
        this.f29970h = registerForActivityResult2;
        final int i12 = 2;
        e.c registerForActivityResult3 = registerForActivityResult(new Object(), new e.b(this) { // from class: od.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f29960b;

            {
                this.f29960b = this;
            }

            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Intent intent2;
                Uri data;
                Intent intent3;
                Intent intent4;
                Uri data2;
                int i112 = i12;
                Object obj2 = null;
                e this$0 = this.f29960b;
                switch (i112) {
                    case 0:
                        e.a aVar = (e.a) obj;
                        int i122 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                obj2 = extras.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap = (Bitmap) obj2;
                            ((g) com.bumptech.glide.b.g(this$0).j().C(bitmap).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType = GroupImageType.Display;
                            groupCreateViewModel.h(groupImageType);
                            ((GroupCreateViewModel) this$0.r()).f9127z = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap);
                            File file = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file, groupImageType);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Uri uri = (Uri) obj;
                        int i13 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri != null) {
                            ((g) com.bumptech.glide.b.g(this$0).l(uri).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel2 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType2 = GroupImageType.Display;
                            groupCreateViewModel2.h(groupImageType2);
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).f9127z = new File(vl.b.z(requireContext, uri));
                            File file2 = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file2 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file2, groupImageType2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        Uri uri2 = (Uri) obj;
                        int i14 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            com.bumptech.glide.b.g(this$0).l(uri2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel3 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType3 = GroupImageType.Cover;
                            groupCreateViewModel3.h(groupImageType3);
                            Context requireContext2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).A = new File(vl.b.z(requireContext2, uri2));
                            File file3 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file3 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file3, groupImageType3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        e.a aVar2 = (e.a) obj;
                        int i15 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1 && (intent2 = aVar2.f14611b) != null && (data = intent2.getData()) != null) {
                            ((g) com.bumptech.glide.b.g(this$0).l(data).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel4 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType4 = GroupImageType.Display;
                            groupCreateViewModel4.h(groupImageType4);
                            Context requireContext3 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).f9127z = new File(vl.b.z(requireContext3, data));
                            File file4 = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file4 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file4, groupImageType4);
                                return;
                            }
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar3 = (e.a) obj;
                        int i16 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent3 = aVar3.f14611b) != null) {
                            Bundle extras2 = intent3.getExtras();
                            if (extras2 != null) {
                                obj2 = extras2.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap2 = (Bitmap) obj2;
                            com.bumptech.glide.b.g(this$0).j().C(bitmap2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel5 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType5 = GroupImageType.Cover;
                            groupCreateViewModel5.h(groupImageType5);
                            ((GroupCreateViewModel) this$0.r()).A = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap2);
                            File file5 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file5 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file5, groupImageType5);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e.a aVar4 = (e.a) obj;
                        int i17 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar4.f14610a == -1 && (intent4 = aVar4.f14611b) != null && (data2 = intent4.getData()) != null) {
                            com.bumptech.glide.b.g(this$0).l(data2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel6 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType6 = GroupImageType.Cover;
                            groupCreateViewModel6.h(groupImageType6);
                            Context requireContext4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).A = new File(vl.b.z(requireContext4, data2));
                            File file6 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file6 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file6, groupImageType6);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult3, "registerForActivityResult(...)");
        this.f29971i = registerForActivityResult3;
        final int i13 = 3;
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult(new Object(), new e.b(this) { // from class: od.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f29960b;

            {
                this.f29960b = this;
            }

            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Intent intent2;
                Uri data;
                Intent intent3;
                Intent intent4;
                Uri data2;
                int i112 = i13;
                Object obj2 = null;
                e this$0 = this.f29960b;
                switch (i112) {
                    case 0:
                        e.a aVar = (e.a) obj;
                        int i122 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                obj2 = extras.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap = (Bitmap) obj2;
                            ((g) com.bumptech.glide.b.g(this$0).j().C(bitmap).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType = GroupImageType.Display;
                            groupCreateViewModel.h(groupImageType);
                            ((GroupCreateViewModel) this$0.r()).f9127z = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap);
                            File file = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file, groupImageType);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Uri uri = (Uri) obj;
                        int i132 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri != null) {
                            ((g) com.bumptech.glide.b.g(this$0).l(uri).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel2 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType2 = GroupImageType.Display;
                            groupCreateViewModel2.h(groupImageType2);
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).f9127z = new File(vl.b.z(requireContext, uri));
                            File file2 = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file2 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file2, groupImageType2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        Uri uri2 = (Uri) obj;
                        int i14 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            com.bumptech.glide.b.g(this$0).l(uri2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel3 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType3 = GroupImageType.Cover;
                            groupCreateViewModel3.h(groupImageType3);
                            Context requireContext2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).A = new File(vl.b.z(requireContext2, uri2));
                            File file3 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file3 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file3, groupImageType3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        e.a aVar2 = (e.a) obj;
                        int i15 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1 && (intent2 = aVar2.f14611b) != null && (data = intent2.getData()) != null) {
                            ((g) com.bumptech.glide.b.g(this$0).l(data).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel4 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType4 = GroupImageType.Display;
                            groupCreateViewModel4.h(groupImageType4);
                            Context requireContext3 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).f9127z = new File(vl.b.z(requireContext3, data));
                            File file4 = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file4 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file4, groupImageType4);
                                return;
                            }
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar3 = (e.a) obj;
                        int i16 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent3 = aVar3.f14611b) != null) {
                            Bundle extras2 = intent3.getExtras();
                            if (extras2 != null) {
                                obj2 = extras2.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap2 = (Bitmap) obj2;
                            com.bumptech.glide.b.g(this$0).j().C(bitmap2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel5 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType5 = GroupImageType.Cover;
                            groupCreateViewModel5.h(groupImageType5);
                            ((GroupCreateViewModel) this$0.r()).A = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap2);
                            File file5 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file5 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file5, groupImageType5);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e.a aVar4 = (e.a) obj;
                        int i17 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar4.f14610a == -1 && (intent4 = aVar4.f14611b) != null && (data2 = intent4.getData()) != null) {
                            com.bumptech.glide.b.g(this$0).l(data2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel6 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType6 = GroupImageType.Cover;
                            groupCreateViewModel6.h(groupImageType6);
                            Context requireContext4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).A = new File(vl.b.z(requireContext4, data2));
                            File file6 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file6 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file6, groupImageType6);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }), "registerForActivityResult(...)");
        final int i14 = 4;
        e.c registerForActivityResult4 = registerForActivityResult(new Object(), new e.b(this) { // from class: od.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f29960b;

            {
                this.f29960b = this;
            }

            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Intent intent2;
                Uri data;
                Intent intent3;
                Intent intent4;
                Uri data2;
                int i112 = i14;
                Object obj2 = null;
                e this$0 = this.f29960b;
                switch (i112) {
                    case 0:
                        e.a aVar = (e.a) obj;
                        int i122 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                obj2 = extras.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap = (Bitmap) obj2;
                            ((g) com.bumptech.glide.b.g(this$0).j().C(bitmap).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType = GroupImageType.Display;
                            groupCreateViewModel.h(groupImageType);
                            ((GroupCreateViewModel) this$0.r()).f9127z = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap);
                            File file = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file, groupImageType);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Uri uri = (Uri) obj;
                        int i132 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri != null) {
                            ((g) com.bumptech.glide.b.g(this$0).l(uri).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel2 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType2 = GroupImageType.Display;
                            groupCreateViewModel2.h(groupImageType2);
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).f9127z = new File(vl.b.z(requireContext, uri));
                            File file2 = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file2 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file2, groupImageType2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        Uri uri2 = (Uri) obj;
                        int i142 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            com.bumptech.glide.b.g(this$0).l(uri2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel3 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType3 = GroupImageType.Cover;
                            groupCreateViewModel3.h(groupImageType3);
                            Context requireContext2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).A = new File(vl.b.z(requireContext2, uri2));
                            File file3 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file3 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file3, groupImageType3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        e.a aVar2 = (e.a) obj;
                        int i15 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1 && (intent2 = aVar2.f14611b) != null && (data = intent2.getData()) != null) {
                            ((g) com.bumptech.glide.b.g(this$0).l(data).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel4 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType4 = GroupImageType.Display;
                            groupCreateViewModel4.h(groupImageType4);
                            Context requireContext3 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).f9127z = new File(vl.b.z(requireContext3, data));
                            File file4 = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file4 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file4, groupImageType4);
                                return;
                            }
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar3 = (e.a) obj;
                        int i16 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent3 = aVar3.f14611b) != null) {
                            Bundle extras2 = intent3.getExtras();
                            if (extras2 != null) {
                                obj2 = extras2.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap2 = (Bitmap) obj2;
                            com.bumptech.glide.b.g(this$0).j().C(bitmap2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel5 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType5 = GroupImageType.Cover;
                            groupCreateViewModel5.h(groupImageType5);
                            ((GroupCreateViewModel) this$0.r()).A = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap2);
                            File file5 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file5 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file5, groupImageType5);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e.a aVar4 = (e.a) obj;
                        int i17 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar4.f14610a == -1 && (intent4 = aVar4.f14611b) != null && (data2 = intent4.getData()) != null) {
                            com.bumptech.glide.b.g(this$0).l(data2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel6 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType6 = GroupImageType.Cover;
                            groupCreateViewModel6.h(groupImageType6);
                            Context requireContext4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).A = new File(vl.b.z(requireContext4, data2));
                            File file6 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file6 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file6, groupImageType6);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult4, "registerForActivityResult(...)");
        this.f29972j = registerForActivityResult4;
        final int i15 = 5;
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult(new Object(), new e.b(this) { // from class: od.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f29960b;

            {
                this.f29960b = this;
            }

            @Override // e.b
            public final void d(Object obj) {
                Intent intent;
                Intent intent2;
                Uri data;
                Intent intent3;
                Intent intent4;
                Uri data2;
                int i112 = i15;
                Object obj2 = null;
                e this$0 = this.f29960b;
                switch (i112) {
                    case 0:
                        e.a aVar = (e.a) obj;
                        int i122 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar.f14610a == -1 && (intent = aVar.f14611b) != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                obj2 = extras.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap = (Bitmap) obj2;
                            ((g) com.bumptech.glide.b.g(this$0).j().C(bitmap).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType = GroupImageType.Display;
                            groupCreateViewModel.h(groupImageType);
                            ((GroupCreateViewModel) this$0.r()).f9127z = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap);
                            File file = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file, groupImageType);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        Uri uri = (Uri) obj;
                        int i132 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri != null) {
                            ((g) com.bumptech.glide.b.g(this$0).l(uri).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel2 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType2 = GroupImageType.Display;
                            groupCreateViewModel2.h(groupImageType2);
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).f9127z = new File(vl.b.z(requireContext, uri));
                            File file2 = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file2 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file2, groupImageType2);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        Uri uri2 = (Uri) obj;
                        int i142 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (uri2 != null) {
                            com.bumptech.glide.b.g(this$0).l(uri2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel3 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType3 = GroupImageType.Cover;
                            groupCreateViewModel3.h(groupImageType3);
                            Context requireContext2 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).A = new File(vl.b.z(requireContext2, uri2));
                            File file3 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file3 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file3, groupImageType3);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        e.a aVar2 = (e.a) obj;
                        int i152 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar2.f14610a == -1 && (intent2 = aVar2.f14611b) != null && (data = intent2.getData()) != null) {
                            ((g) com.bumptech.glide.b.g(this$0).l(data).b()).z(((ug) this$0.q()).f6299w);
                            GroupCreateViewModel groupCreateViewModel4 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType4 = GroupImageType.Display;
                            groupCreateViewModel4.h(groupImageType4);
                            Context requireContext3 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).f9127z = new File(vl.b.z(requireContext3, data));
                            File file4 = ((GroupCreateViewModel) this$0.r()).f9127z;
                            if (file4 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file4, groupImageType4);
                                return;
                            }
                            return;
                        }
                        return;
                    case 4:
                        e.a aVar3 = (e.a) obj;
                        int i16 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar3.f14610a == -1 && (intent3 = aVar3.f14611b) != null) {
                            Bundle extras2 = intent3.getExtras();
                            if (extras2 != null) {
                                obj2 = extras2.get("data");
                            }
                            Intrinsics.d(obj2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Bitmap bitmap2 = (Bitmap) obj2;
                            com.bumptech.glide.b.g(this$0).j().C(bitmap2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel5 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType5 = GroupImageType.Cover;
                            groupCreateViewModel5.h(groupImageType5);
                            ((GroupCreateViewModel) this$0.r()).A = vl.b.d(new ContextWrapper(this$0.getContext()), bitmap2);
                            File file5 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file5 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file5, groupImageType5);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e.a aVar4 = (e.a) obj;
                        int i17 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (aVar4.f14610a == -1 && (intent4 = aVar4.f14611b) != null && (data2 = intent4.getData()) != null) {
                            com.bumptech.glide.b.g(this$0).l(data2).z(((ug) this$0.q()).f6297u);
                            GroupCreateViewModel groupCreateViewModel6 = (GroupCreateViewModel) this$0.r();
                            GroupImageType groupImageType6 = GroupImageType.Cover;
                            groupCreateViewModel6.h(groupImageType6);
                            Context requireContext4 = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                            ((GroupCreateViewModel) this$0.r()).A = new File(vl.b.z(requireContext4, data2));
                            File file6 = ((GroupCreateViewModel) this$0.r()).A;
                            if (file6 != null) {
                                ((GroupCreateViewModel) this$0.r()).i(file6, groupImageType6);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        }), "registerForActivityResult(...)");
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_create_social_group;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((GroupCreateViewModel) r()).f9084g.observe(this, new id.a(2, new d(this, 0)));
        ((GroupCreateViewModel) r()).f9120s.observe(this, new id.a(2, new d(this, 1)));
        ((GroupCreateViewModel) r()).f9121t.observe(this, new id.a(2, new d(this, 2)));
        ((GroupCreateViewModel) r()).f9118q.observe(this, new id.a(2, new d(this, 3)));
        ((GroupCreateViewModel) r()).f9122u.observe(this, new id.a(2, new d(this, 4)));
        ((GroupCreateViewModel) r()).f9119r.observe(this, new id.a(2, new d(this, 5)));
    }

    @Override // gd.m
    public final void E(View view) {
        CharLimit charLimit;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(view, "view");
        ((GroupCreateViewModel) r()).f9117p.postValue(Boolean.FALSE);
        Bundle arguments = getArguments();
        final int i12 = 0;
        final int i13 = 1;
        if (arguments != null && (charLimit = (CharLimit) arguments.getParcelable("CHAR_LIMIT")) != null) {
            Integer groupNameMax = charLimit.getGroupNameMax();
            if (groupNameMax != null) {
                i10 = groupNameMax.intValue();
            } else {
                i10 = 50;
            }
            Integer groupDescMax = charLimit.getGroupDescMax();
            if (groupDescMax != null) {
                i11 = groupDescMax.intValue();
            } else {
                i11 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
            }
            ((ug) q()).f6300x.getInputEditText().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i10)});
            ((ug) q()).f6298v.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i11)});
        }
        ((ug) q()).f6300x.setOnInputViewAction(new f(this, 1));
        ((ug) q()).f6302z.setOnClickListener(new View.OnClickListener(this) { // from class: od.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f29962b;

            {
                this.f29962b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                int i14 = i12;
                e this$0 = this.f29962b;
                switch (i14) {
                    case 0:
                        int i15 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.H(((ug) this$0.q()).f6300x.getInputValue())) {
                            ((GroupCreateViewModel) this$0.r()).C = ((ug) this$0.q()).f6300x.getInputValue();
                            ((GroupCreateViewModel) this$0.r()).F = ((ug) this$0.q()).f6301y.getInputValue();
                            ((GroupCreateViewModel) this$0.r()).D = ((ug) this$0.q()).f6298v.getText().toString();
                            GroupCreateViewModel groupCreateViewModel = (GroupCreateViewModel) this$0.r();
                            String inputValue = ((ug) this$0.q()).f6295s.getInputValue();
                            List<DiscoverCategory> list = (List) ((GroupCreateViewModel) this$0.r()).f9121t.getValue();
                            if (list != null) {
                                for (DiscoverCategory discoverCategory : list) {
                                    if (discoverCategory.getCategoryName().equals(inputValue)) {
                                        str = discoverCategory.getCategoryId();
                                        groupCreateViewModel.E = str;
                                        ((GroupCreateViewModel) this$0.r()).B = UUID.randomUUID().toString();
                                        ((ug) this$0.q()).B.isChecked();
                                        GroupCreateViewModel groupCreateViewModel2 = (GroupCreateViewModel) this$0.r();
                                        e0 e0Var = groupCreateViewModel2.f9084g;
                                        Boolean bool = Boolean.TRUE;
                                        e0Var.postValue(bool);
                                        String str2 = groupCreateViewModel2.B;
                                        String str3 = groupCreateViewModel2.C;
                                        String str4 = groupCreateViewModel2.f9124w;
                                        String str5 = groupCreateViewModel2.f9125x;
                                        String str6 = groupCreateViewModel2.D;
                                        ChatRepository chatRepository = groupCreateViewModel2.f9116o;
                                        h c10 = chatRepository.createSocialChatGroup(new SocialChatGroup(str2, str3, str4, str5, str6, "FREE", chatRepository.getUserId(), groupCreateViewModel2.E, groupCreateViewModel2.F, "Social", null, bool)).c(((kq.e) groupCreateViewModel2.f9079b).J());
                                        jt.d dVar = new jt.d(new id.h(11, new md.a(groupCreateViewModel2, 2)), new id.h(12, new md.a(groupCreateViewModel2, 3)));
                                        c10.a(dVar);
                                        groupCreateViewModel2.f9080c.c(dVar);
                                        return;
                                    }
                                }
                            }
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                            groupCreateViewModel.E = str;
                            ((GroupCreateViewModel) this$0.r()).B = UUID.randomUUID().toString();
                            ((ug) this$0.q()).B.isChecked();
                            GroupCreateViewModel groupCreateViewModel22 = (GroupCreateViewModel) this$0.r();
                            e0 e0Var2 = groupCreateViewModel22.f9084g;
                            Boolean bool2 = Boolean.TRUE;
                            e0Var2.postValue(bool2);
                            String str22 = groupCreateViewModel22.B;
                            String str32 = groupCreateViewModel22.C;
                            String str42 = groupCreateViewModel22.f9124w;
                            String str52 = groupCreateViewModel22.f9125x;
                            String str62 = groupCreateViewModel22.D;
                            ChatRepository chatRepository2 = groupCreateViewModel22.f9116o;
                            h c102 = chatRepository2.createSocialChatGroup(new SocialChatGroup(str22, str32, str42, str52, str62, "FREE", chatRepository2.getUserId(), groupCreateViewModel22.E, groupCreateViewModel22.F, "Social", null, bool2)).c(((kq.e) groupCreateViewModel22.f9079b).J());
                            jt.d dVar2 = new jt.d(new id.h(11, new md.a(groupCreateViewModel22, 2)), new id.h(12, new md.a(groupCreateViewModel22, 3)));
                            c102.a(dVar2);
                            groupCreateViewModel22.f9080c.c(dVar2);
                            return;
                        }
                        ((ug) this$0.q()).f6300x.setErrorText(R.string.invalid_name);
                        return;
                    case 1:
                        int i16 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((GroupCreateViewModel) this$0.r()).h(GroupImageType.Display);
                        this$0.J();
                        return;
                    case 2:
                        int i17 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((ug) this$0.q()).f6299w.performClick();
                        return;
                    default:
                        int i18 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((GroupCreateViewModel) this$0.r()).h(GroupImageType.Cover);
                        this$0.J();
                        return;
                }
            }
        });
        ((ug) q()).f6299w.setOnClickListener(new View.OnClickListener(this) { // from class: od.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f29962b;

            {
                this.f29962b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                int i14 = i13;
                e this$0 = this.f29962b;
                switch (i14) {
                    case 0:
                        int i15 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.H(((ug) this$0.q()).f6300x.getInputValue())) {
                            ((GroupCreateViewModel) this$0.r()).C = ((ug) this$0.q()).f6300x.getInputValue();
                            ((GroupCreateViewModel) this$0.r()).F = ((ug) this$0.q()).f6301y.getInputValue();
                            ((GroupCreateViewModel) this$0.r()).D = ((ug) this$0.q()).f6298v.getText().toString();
                            GroupCreateViewModel groupCreateViewModel = (GroupCreateViewModel) this$0.r();
                            String inputValue = ((ug) this$0.q()).f6295s.getInputValue();
                            List<DiscoverCategory> list = (List) ((GroupCreateViewModel) this$0.r()).f9121t.getValue();
                            if (list != null) {
                                for (DiscoverCategory discoverCategory : list) {
                                    if (discoverCategory.getCategoryName().equals(inputValue)) {
                                        str = discoverCategory.getCategoryId();
                                        groupCreateViewModel.E = str;
                                        ((GroupCreateViewModel) this$0.r()).B = UUID.randomUUID().toString();
                                        ((ug) this$0.q()).B.isChecked();
                                        GroupCreateViewModel groupCreateViewModel22 = (GroupCreateViewModel) this$0.r();
                                        e0 e0Var2 = groupCreateViewModel22.f9084g;
                                        Boolean bool2 = Boolean.TRUE;
                                        e0Var2.postValue(bool2);
                                        String str22 = groupCreateViewModel22.B;
                                        String str32 = groupCreateViewModel22.C;
                                        String str42 = groupCreateViewModel22.f9124w;
                                        String str52 = groupCreateViewModel22.f9125x;
                                        String str62 = groupCreateViewModel22.D;
                                        ChatRepository chatRepository2 = groupCreateViewModel22.f9116o;
                                        h c102 = chatRepository2.createSocialChatGroup(new SocialChatGroup(str22, str32, str42, str52, str62, "FREE", chatRepository2.getUserId(), groupCreateViewModel22.E, groupCreateViewModel22.F, "Social", null, bool2)).c(((kq.e) groupCreateViewModel22.f9079b).J());
                                        jt.d dVar2 = new jt.d(new id.h(11, new md.a(groupCreateViewModel22, 2)), new id.h(12, new md.a(groupCreateViewModel22, 3)));
                                        c102.a(dVar2);
                                        groupCreateViewModel22.f9080c.c(dVar2);
                                        return;
                                    }
                                }
                            }
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                            groupCreateViewModel.E = str;
                            ((GroupCreateViewModel) this$0.r()).B = UUID.randomUUID().toString();
                            ((ug) this$0.q()).B.isChecked();
                            GroupCreateViewModel groupCreateViewModel222 = (GroupCreateViewModel) this$0.r();
                            e0 e0Var22 = groupCreateViewModel222.f9084g;
                            Boolean bool22 = Boolean.TRUE;
                            e0Var22.postValue(bool22);
                            String str222 = groupCreateViewModel222.B;
                            String str322 = groupCreateViewModel222.C;
                            String str422 = groupCreateViewModel222.f9124w;
                            String str522 = groupCreateViewModel222.f9125x;
                            String str622 = groupCreateViewModel222.D;
                            ChatRepository chatRepository22 = groupCreateViewModel222.f9116o;
                            h c1022 = chatRepository22.createSocialChatGroup(new SocialChatGroup(str222, str322, str422, str522, str622, "FREE", chatRepository22.getUserId(), groupCreateViewModel222.E, groupCreateViewModel222.F, "Social", null, bool22)).c(((kq.e) groupCreateViewModel222.f9079b).J());
                            jt.d dVar22 = new jt.d(new id.h(11, new md.a(groupCreateViewModel222, 2)), new id.h(12, new md.a(groupCreateViewModel222, 3)));
                            c1022.a(dVar22);
                            groupCreateViewModel222.f9080c.c(dVar22);
                            return;
                        }
                        ((ug) this$0.q()).f6300x.setErrorText(R.string.invalid_name);
                        return;
                    case 1:
                        int i16 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((GroupCreateViewModel) this$0.r()).h(GroupImageType.Display);
                        this$0.J();
                        return;
                    case 2:
                        int i17 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((ug) this$0.q()).f6299w.performClick();
                        return;
                    default:
                        int i18 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((GroupCreateViewModel) this$0.r()).h(GroupImageType.Cover);
                        this$0.J();
                        return;
                }
            }
        });
        final int i14 = 2;
        ((ug) q()).f6296t.setOnClickListener(new View.OnClickListener(this) { // from class: od.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f29962b;

            {
                this.f29962b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                int i142 = i14;
                e this$0 = this.f29962b;
                switch (i142) {
                    case 0:
                        int i15 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.H(((ug) this$0.q()).f6300x.getInputValue())) {
                            ((GroupCreateViewModel) this$0.r()).C = ((ug) this$0.q()).f6300x.getInputValue();
                            ((GroupCreateViewModel) this$0.r()).F = ((ug) this$0.q()).f6301y.getInputValue();
                            ((GroupCreateViewModel) this$0.r()).D = ((ug) this$0.q()).f6298v.getText().toString();
                            GroupCreateViewModel groupCreateViewModel = (GroupCreateViewModel) this$0.r();
                            String inputValue = ((ug) this$0.q()).f6295s.getInputValue();
                            List<DiscoverCategory> list = (List) ((GroupCreateViewModel) this$0.r()).f9121t.getValue();
                            if (list != null) {
                                for (DiscoverCategory discoverCategory : list) {
                                    if (discoverCategory.getCategoryName().equals(inputValue)) {
                                        str = discoverCategory.getCategoryId();
                                        groupCreateViewModel.E = str;
                                        ((GroupCreateViewModel) this$0.r()).B = UUID.randomUUID().toString();
                                        ((ug) this$0.q()).B.isChecked();
                                        GroupCreateViewModel groupCreateViewModel222 = (GroupCreateViewModel) this$0.r();
                                        e0 e0Var22 = groupCreateViewModel222.f9084g;
                                        Boolean bool22 = Boolean.TRUE;
                                        e0Var22.postValue(bool22);
                                        String str222 = groupCreateViewModel222.B;
                                        String str322 = groupCreateViewModel222.C;
                                        String str422 = groupCreateViewModel222.f9124w;
                                        String str522 = groupCreateViewModel222.f9125x;
                                        String str622 = groupCreateViewModel222.D;
                                        ChatRepository chatRepository22 = groupCreateViewModel222.f9116o;
                                        h c1022 = chatRepository22.createSocialChatGroup(new SocialChatGroup(str222, str322, str422, str522, str622, "FREE", chatRepository22.getUserId(), groupCreateViewModel222.E, groupCreateViewModel222.F, "Social", null, bool22)).c(((kq.e) groupCreateViewModel222.f9079b).J());
                                        jt.d dVar22 = new jt.d(new id.h(11, new md.a(groupCreateViewModel222, 2)), new id.h(12, new md.a(groupCreateViewModel222, 3)));
                                        c1022.a(dVar22);
                                        groupCreateViewModel222.f9080c.c(dVar22);
                                        return;
                                    }
                                }
                            }
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                            groupCreateViewModel.E = str;
                            ((GroupCreateViewModel) this$0.r()).B = UUID.randomUUID().toString();
                            ((ug) this$0.q()).B.isChecked();
                            GroupCreateViewModel groupCreateViewModel2222 = (GroupCreateViewModel) this$0.r();
                            e0 e0Var222 = groupCreateViewModel2222.f9084g;
                            Boolean bool222 = Boolean.TRUE;
                            e0Var222.postValue(bool222);
                            String str2222 = groupCreateViewModel2222.B;
                            String str3222 = groupCreateViewModel2222.C;
                            String str4222 = groupCreateViewModel2222.f9124w;
                            String str5222 = groupCreateViewModel2222.f9125x;
                            String str6222 = groupCreateViewModel2222.D;
                            ChatRepository chatRepository222 = groupCreateViewModel2222.f9116o;
                            h c10222 = chatRepository222.createSocialChatGroup(new SocialChatGroup(str2222, str3222, str4222, str5222, str6222, "FREE", chatRepository222.getUserId(), groupCreateViewModel2222.E, groupCreateViewModel2222.F, "Social", null, bool222)).c(((kq.e) groupCreateViewModel2222.f9079b).J());
                            jt.d dVar222 = new jt.d(new id.h(11, new md.a(groupCreateViewModel2222, 2)), new id.h(12, new md.a(groupCreateViewModel2222, 3)));
                            c10222.a(dVar222);
                            groupCreateViewModel2222.f9080c.c(dVar222);
                            return;
                        }
                        ((ug) this$0.q()).f6300x.setErrorText(R.string.invalid_name);
                        return;
                    case 1:
                        int i16 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((GroupCreateViewModel) this$0.r()).h(GroupImageType.Display);
                        this$0.J();
                        return;
                    case 2:
                        int i17 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((ug) this$0.q()).f6299w.performClick();
                        return;
                    default:
                        int i18 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((GroupCreateViewModel) this$0.r()).h(GroupImageType.Cover);
                        this$0.J();
                        return;
                }
            }
        });
        final int i15 = 3;
        ((ug) q()).f6297u.setOnClickListener(new View.OnClickListener(this) { // from class: od.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f29962b;

            {
                this.f29962b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str;
                int i142 = i15;
                e this$0 = this.f29962b;
                switch (i142) {
                    case 0:
                        int i152 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (this$0.H(((ug) this$0.q()).f6300x.getInputValue())) {
                            ((GroupCreateViewModel) this$0.r()).C = ((ug) this$0.q()).f6300x.getInputValue();
                            ((GroupCreateViewModel) this$0.r()).F = ((ug) this$0.q()).f6301y.getInputValue();
                            ((GroupCreateViewModel) this$0.r()).D = ((ug) this$0.q()).f6298v.getText().toString();
                            GroupCreateViewModel groupCreateViewModel = (GroupCreateViewModel) this$0.r();
                            String inputValue = ((ug) this$0.q()).f6295s.getInputValue();
                            List<DiscoverCategory> list = (List) ((GroupCreateViewModel) this$0.r()).f9121t.getValue();
                            if (list != null) {
                                for (DiscoverCategory discoverCategory : list) {
                                    if (discoverCategory.getCategoryName().equals(inputValue)) {
                                        str = discoverCategory.getCategoryId();
                                        groupCreateViewModel.E = str;
                                        ((GroupCreateViewModel) this$0.r()).B = UUID.randomUUID().toString();
                                        ((ug) this$0.q()).B.isChecked();
                                        GroupCreateViewModel groupCreateViewModel2222 = (GroupCreateViewModel) this$0.r();
                                        e0 e0Var222 = groupCreateViewModel2222.f9084g;
                                        Boolean bool222 = Boolean.TRUE;
                                        e0Var222.postValue(bool222);
                                        String str2222 = groupCreateViewModel2222.B;
                                        String str3222 = groupCreateViewModel2222.C;
                                        String str4222 = groupCreateViewModel2222.f9124w;
                                        String str5222 = groupCreateViewModel2222.f9125x;
                                        String str6222 = groupCreateViewModel2222.D;
                                        ChatRepository chatRepository222 = groupCreateViewModel2222.f9116o;
                                        h c10222 = chatRepository222.createSocialChatGroup(new SocialChatGroup(str2222, str3222, str4222, str5222, str6222, "FREE", chatRepository222.getUserId(), groupCreateViewModel2222.E, groupCreateViewModel2222.F, "Social", null, bool222)).c(((kq.e) groupCreateViewModel2222.f9079b).J());
                                        jt.d dVar222 = new jt.d(new id.h(11, new md.a(groupCreateViewModel2222, 2)), new id.h(12, new md.a(groupCreateViewModel2222, 3)));
                                        c10222.a(dVar222);
                                        groupCreateViewModel2222.f9080c.c(dVar222);
                                        return;
                                    }
                                }
                            }
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                            groupCreateViewModel.E = str;
                            ((GroupCreateViewModel) this$0.r()).B = UUID.randomUUID().toString();
                            ((ug) this$0.q()).B.isChecked();
                            GroupCreateViewModel groupCreateViewModel22222 = (GroupCreateViewModel) this$0.r();
                            e0 e0Var2222 = groupCreateViewModel22222.f9084g;
                            Boolean bool2222 = Boolean.TRUE;
                            e0Var2222.postValue(bool2222);
                            String str22222 = groupCreateViewModel22222.B;
                            String str32222 = groupCreateViewModel22222.C;
                            String str42222 = groupCreateViewModel22222.f9124w;
                            String str52222 = groupCreateViewModel22222.f9125x;
                            String str62222 = groupCreateViewModel22222.D;
                            ChatRepository chatRepository2222 = groupCreateViewModel22222.f9116o;
                            h c102222 = chatRepository2222.createSocialChatGroup(new SocialChatGroup(str22222, str32222, str42222, str52222, str62222, "FREE", chatRepository2222.getUserId(), groupCreateViewModel22222.E, groupCreateViewModel22222.F, "Social", null, bool2222)).c(((kq.e) groupCreateViewModel22222.f9079b).J());
                            jt.d dVar2222 = new jt.d(new id.h(11, new md.a(groupCreateViewModel22222, 2)), new id.h(12, new md.a(groupCreateViewModel22222, 3)));
                            c102222.a(dVar2222);
                            groupCreateViewModel22222.f9080c.c(dVar2222);
                            return;
                        }
                        ((ug) this$0.q()).f6300x.setErrorText(R.string.invalid_name);
                        return;
                    case 1:
                        int i16 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((GroupCreateViewModel) this$0.r()).h(GroupImageType.Display);
                        this$0.J();
                        return;
                    case 2:
                        int i17 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((ug) this$0.q()).f6299w.performClick();
                        return;
                    default:
                        int i18 = e.f29968k;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((GroupCreateViewModel) this$0.r()).h(GroupImageType.Cover);
                        this$0.J();
                        return;
                }
            }
        });
    }

    public final boolean H(String str) {
        if (TextUtils.isEmpty(str)) {
            ((ug) q()).f6300x.m();
            ((ug) q()).f6300x.n();
            return false;
        }
        ((ug) q()).f6300x.m();
        ((ug) q()).f6300x.setIcon(R.drawable.ic_success);
        return true;
    }

    public final void I() {
        if (kj.f.m(this)) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (getActivity() != null) {
                Intent intent2 = new Intent(intent);
                if (((GroupCreateViewModel) r()).f9126y == GroupImageType.Cover) {
                    this.f29972j.a(intent2);
                    return;
                } else {
                    this.f29969g.a(intent2);
                    return;
                }
            }
            return;
        }
        kj.f.b(this, 1003, new lc.b(this, 7));
    }

    public final void J() {
        j0 activity = getActivity();
        if (activity != null) {
            final ao.f fVar = new ao.f(activity, R.style.AppBottomSheetDialogTheme);
            LayoutInflater from = LayoutInflater.from(requireContext());
            int i10 = dg.f4486u;
            final int i11 = 0;
            dg dgVar = (dg) m4.m.g(from, R.layout.fragment_bottom_sheet_photo_select, null, false, null);
            Intrinsics.checkNotNullExpressionValue(dgVar, "inflate(...)");
            fVar.setContentView(dgVar.f27491e);
            fVar.show();
            dgVar.f4487s.setOnClickListener(new View.OnClickListener(this) { // from class: od.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f29964b;

                {
                    this.f29964b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i12 = i11;
                    ao.f mBottomSheetDialog = fVar;
                    e this$0 = this.f29964b;
                    switch (i12) {
                        case 0:
                            int i13 = e.f29968k;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(mBottomSheetDialog, "$mBottomSheetDialog");
                            this$0.I();
                            mBottomSheetDialog.dismiss();
                            return;
                        default:
                            int i14 = e.f29968k;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(mBottomSheetDialog, "$mBottomSheetDialog");
                            GroupImageType groupImageType = ((GroupCreateViewModel) this$0.r()).f9126y;
                            GroupImageType groupImageType2 = GroupImageType.Cover;
                            f.d dVar = f.d.f15871a;
                            if (groupImageType == groupImageType2) {
                                this$0.f29971i.a(i0.e(dVar));
                            } else {
                                this$0.f29970h.a(i0.e(dVar));
                            }
                            mBottomSheetDialog.dismiss();
                            return;
                    }
                }
            });
            final int i12 = 1;
            dgVar.f4488t.setOnClickListener(new View.OnClickListener(this) { // from class: od.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f29964b;

                {
                    this.f29964b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = i12;
                    ao.f mBottomSheetDialog = fVar;
                    e this$0 = this.f29964b;
                    switch (i122) {
                        case 0:
                            int i13 = e.f29968k;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(mBottomSheetDialog, "$mBottomSheetDialog");
                            this$0.I();
                            mBottomSheetDialog.dismiss();
                            return;
                        default:
                            int i14 = e.f29968k;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(mBottomSheetDialog, "$mBottomSheetDialog");
                            GroupImageType groupImageType = ((GroupCreateViewModel) this$0.r()).f9126y;
                            GroupImageType groupImageType2 = GroupImageType.Cover;
                            f.d dVar = f.d.f15871a;
                            if (groupImageType == groupImageType2) {
                                this$0.f29971i.a(i0.e(dVar));
                            } else {
                                this$0.f29970h.a(i0.e(dVar));
                            }
                            mBottomSheetDialog.dismiss();
                            return;
                    }
                }
            });
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i10, permissions, grantResults);
        if (i10 == 1003) {
            if (kj.f.m(this)) {
                I();
                return;
            } else {
                dp.b.M1(requireContext(), getString(R.string.text_camera_permission_rationale));
                return;
            }
        }
        super.onRequestPermissionsResult(i10, permissions, grantResults);
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        ChatRepository chatRepository = bVar.b();
        yk.g.i(chatRepository);
        FollowerRepository followerRepository = bVar.f();
        yk.g.i(followerRepository);
        ContactsRepository contactsRepository = fragmentComponent.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(GroupCreateViewModel.class), new ea.b(k10, c10, followerRepository, chatRepository, contactsRepository, userRepository, 3));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, GroupCreateViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(GroupCreateViewModel.class, "<this>", GroupCreateViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            GroupCreateViewModel groupCreateViewModel = (GroupCreateViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(groupCreateViewModel);
            this.f17284b = groupCreateViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            yk.g.i(h12);
            this.f17287e = h12;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
