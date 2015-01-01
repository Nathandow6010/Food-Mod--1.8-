package net.minecast.mod.fm.init;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;

public class Item_cup extends ModelBase
{
	
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
  
  public Item_cup()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 25);
      Shape1.addBox(0F, 0F, 0F, 3, 6, 1);
      Shape1.setRotationPoint(3F, 17F, -3F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 16, 25);
      Shape2.addBox(0F, 0F, 0F, 3, 6, 1);
      Shape2.setRotationPoint(3F, 17F, -7F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 24, 23);
      Shape3.addBox(0F, 0F, 0F, 1, 6, 3);
      Shape3.setRotationPoint(2F, 17F, -6F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 8, 23);
      Shape4.addBox(0F, 0F, 0F, 1, 6, 3);
      Shape4.setRotationPoint(6F, 17F, -6F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 32, 28);
      Shape5.addBox(0F, 0F, 0F, 3, 1, 3);
      Shape5.setRotationPoint(3F, 23F, -6F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 16, 23);
      Shape6.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape6.setRotationPoint(0F, 21F, -5F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 23);
      Shape7.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape7.setRotationPoint(0F, 18F, -5F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 32, 25);
      Shape8.addBox(0F, 0F, 0F, 1, 2, 1);
      Shape8.setRotationPoint(0F, 19F, -5F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

public Item setUnlocalizedName(String string) {
	// TODO Auto-generated method stub
	return null;
}

}
