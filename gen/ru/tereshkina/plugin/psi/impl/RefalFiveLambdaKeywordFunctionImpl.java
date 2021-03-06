// This is a generated file. Not intended for manual editing.
package ru.tereshkina.plugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ru.tereshkina.plugin.psi.RefalFiveLambdaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import ru.tereshkina.plugin.psi.*;

public class RefalFiveLambdaKeywordFunctionImpl extends ASTWrapperPsiElement implements RefalFiveLambdaKeywordFunction {

  public RefalFiveLambdaKeywordFunctionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RefalFiveLambdaVisitor visitor) {
    visitor.visitKeywordFunction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RefalFiveLambdaVisitor) accept((RefalFiveLambdaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RefalFiveLambdaBlock getBlock() {
    return findChildByClass(RefalFiveLambdaBlock.class);
  }

  @Override
  @NotNull
  public List<RefalFiveLambdaFuncName> getFuncNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RefalFiveLambdaFuncName.class);
  }

}
